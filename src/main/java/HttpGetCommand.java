/**
 * Клас, який реалізує команду для виконання HTTP GET запиту. Він реалізує інтерфейс {@link Command},
 * ініціюючи виконання GET запиту за допомогою об'єкта {@link HttpGetOperation}.
 */
public class HttpGetCommand implements Command{

    /**
     * Це поле представляє об'єкт типу {@link HttpGetOperation}, який реалізує логіку виконання GET методу.
     */
    private final HttpGetOperation operation;

    /**
     * Строкова змінна, яка містить веб-адресу для виконання GET запиту.
     */
    private final String url;

    /**
     * Це поле представляє цілочислений ідентифікатор команди.
     */
    private final int id;
    
    /**
     * Конструктор класу {@link HttpGetCommand}.
     * @param operation Об'єкт типу HttpGetOperation, який реалізує логіку виконання GET методу.
     * @param url Строкова веб-адреса.
     * @param id Цілочислений ідентифікатор команди.
     */
    public HttpGetCommand(HttpGetOperation operation, String url, int id){
        this.operation = operation;
        this.id = id;
        this.url = url;
    }

    /**
     * Цей метод ініціює обробку GET запиту, викликаючи метод {@link HttpGetOperation#processGetRequest(String)}.
     * Метод обробляє GET запит на вказану URL-адресу.
     */
    @Override
    public void execute(){
        operation.processGetRequest(url);
    }

    /**
     * Цей метод повертає ідентифікатор команди.
     * 
     * @return Цілочислений ідентифікатор команди.
     */
    @Override
    public int getId(){
        return id;
    }

    /**
     * Цей метод повертає веб-адресу команди.
     * @return веб-адреса команди.
     */
    public String getUrl(){
        return url;
    }
}
