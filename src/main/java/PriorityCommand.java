/**
 * Клас, який обгортає команду {@link Command} та надає їй пріоритет.
 */
public class PriorityCommand {

    /**
     * Об'єкт команди {@link Command}, який обгортається в {@link PriorityCommand}.
     */
    private final Command command;

    /**
     * Цілочисельний пріоритет команди.
     * Чим більший пріоритет, тим раніше команда має бути виконана.
     */
    private int priority;

    /**
     * Конструктор класу {@link PriorityCommand}.
     * 
     * @param command Об'єкт типу {@link Command}, який буде виконуватись з певним пріоритетом.
     * @param priority Цілочисельний пріоритет, який визначає порядок виконання команди.
     */
    public PriorityCommand(Command command, int priority){
        this.command = command;
        this.priority = priority; 
    }

    /**
     * Повертає об'єкт команди, яка зберігається в {@link PriorityCommand}.
     * 
     * @return Об'єкт команди {@link Command}.
     */
    public Command getCommand(){
        return command;
    } 

    /**
     * Повертає пріоритет команди, яка зберігається в {@link PriorityCommand}.
     * 
     * @return Цілочисельний пріоритет команди.
     */
    public int getPriority(){
        return priority;
    }

    /**
     * Встановлює новий пріоритет для команди.
     * 
     * @param priority Цілочисельний пріоритет, який потрібно встановити.
     */
    public void setPriority(int priority){
        this.priority = priority; 
    }
}
