import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас для керування HTTP запитами з різними пріоритетами.
 * Цей клас дозволяє додавати, виключати, змінювати пріоритет та обробляти запити.
 * Запити виконуються відповідно до їх пріоритетів: спочатку обробляються запити з вищим пріоритетом.
 */
public class HttpRequestManager {
    
    /**
     * Список об'єктів {@link PriorityCommand}, що містить всі запити.
     */
    private final List<PriorityCommand> requests = new ArrayList<>();
    
    /**
     * Додає новий запит до списку запитів з вказаним пріоритетом.
     * 
     * @param command Об'єкт {@link Command}, який представляє команду для виконання.
     * @param priority Цілочисельний пріоритет, який визначає місце у черзі для виконання запиту.
     */
    public void addRequest(Command command, int priority){
        requests.add(new PriorityCommand(command, priority));
        System.out.println("Added request with id: " + command.getId() + " and priority: " + priority);
    }

    /**
     * Виключає запит зі списку за вказаним ідентифікатором.
     * 
     * @param id Цілочисельний ідентифікатор запиту, який потрібно виключити.
     */
    public void excludeRequest(int id){
        requests.removeIf(pc -> pc.getCommand().getId() == id);
        System.out.println("Excluded request with id: " + id);
    }

    /**
     * Змінює пріоритет запиту за вказаним ідентифікатором.
     * 
     * @param id Цілочисельний ідентифікатор запиту, для якого потрібно змінити пріоритет.
     * @param newPriority Новий пріоритет запиту.
     */
    public void changePriority(int id, int newPriority){
        for (PriorityCommand pc : requests){
            if (pc.getCommand().getId() == id){
                pc.setPriority(newPriority);
                System.out.println("Changed priority for request with id: " + id + " to: " + newPriority);
                break;
            }
        }
    }

    /**
     * Обробляє всі запити у черзі, сортує їх за пріоритетом (від найвищого до найнижчого)
     * та виконує кожен запит.
     */
    public void processRequest(){
        requests.sort(Comparator.comparingInt(PriorityCommand::getPriority).reversed());
        System.out.println("Processing requests...");
        for(PriorityCommand pc : requests){
            pc.getCommand().execute();
        }
    }
}
