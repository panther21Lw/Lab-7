/**
 * Клас, який реалізує команду для виконання HTTP POST запиту. Він використовує об'єкт {@link HttpPostOperation},
 * щоб ініціювати обробку POST запиту до вказаної URL-адреси з певним навантаженням (payload).
 * 
 */
public class HttpPostCommand implements Command{

    /**
     * Об'єкт типу {@link HttpPostOperation}, який виконує логіку обробки HTTP POST запиту.
     */
    private final HttpPostOperation operation;

    /**
     * Строкова змінна, яка містить URL-адресу для виконання POST запиту.
     */
    private final String url;

    /**
     * Строкова змінна, яка містить дані для POST запиту (payload).
     */
    private final String payload;

    /**
     * Цілочисельний ідентифікатор команди.
     */
    private final int id;

    /**
     * Конструктор класу {@link HttpPostCommand}.
     * 
     * @param operation Об'єкт типу {@link HttpPostOperation}, який реалізує логіку виконання POST запиту.
     * @param url Строкова веб-адреса для POST запиту.
     * @param payload Строка, що містить дані (payload), які будуть відправлені в тілі POST запиту.
     * @param id Цілочисельний ідентифікатор команди.
     */
    public HttpPostCommand(HttpPostOperation operation, String url, String payload, int id){
        this.operation = operation;
        this.url = url;
        this.payload = payload;
        this.id = id;
    }

    /**
     * Цей метод ініціює виконання POST запиту за допомогою {@link HttpPostOperation#processPostRequest(String, String)}.
     * Запит відправляється на вказану URL-адресу з переданими даними (payload).
     */
    @Override
    public void execute(){
        operation.processPostRequest(url, payload);
    }
    
    /**
     * Цей метод повертає ідентифікатор команди.
     * 
     * @return Цілочисельний ідентифікатор команди.
     */
    @Override
    public int getId(){
        return id;
    }

    /**
     * Цей метод повертає URL-адресу, на яку буде виконано POST запит.
     * 
     * @return URL для POST запиту.
     */
    public String getUrl(){
        return url;
    }
}
