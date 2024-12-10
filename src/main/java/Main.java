/**
 * Це виконуваний клас програми. Він містить метод для запуску програми.
 */
public class Main {

    /**
     * Метод для запуску програми.
     * Він створює кілька GET та POST запитів, додає їх до менеджера обробки запитів,
     * виключає один запит із черги та виконує кожен запит.
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        HttpPostOperation postOp = new HttpPostOperation();
        HttpGetOperation getOp = new HttpGetOperation();
        HttpRequestManager manager = new HttpRequestManager();

        Command get1 = new HttpGetCommand(getOp, "http://example.com", 1);
        Command post1 = new HttpPostCommand(postOp, "http://all-known-website.com", "{ \"key\": \"value\"}", 2);
        Command get2 = new HttpGetCommand(getOp, "http://chatgpt.com", 3);
        
        manager.addRequest(get1, 5);
        manager.addRequest(post1, 10);
        manager.addRequest(get2, 7);

        manager.changePriority(3, 15);
        manager.excludeRequest(1);

        manager.processRequest();
    }
}
