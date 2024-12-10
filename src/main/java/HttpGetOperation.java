/**
 * Клас, який реалізує обробку HTTP GET запитів. Цей клас відповідає за логіку, 
 * пов'язану з виконанням HTTP GET запиту до заданої веб-адреси.
 */
public class HttpGetOperation {
    /**
     * Обробляє HTTP GET запит до заданої веб-адреси.
     * Цей метод виводить повідомлення про обробку запиту.
     * @param url Строкова веб-адреса.
     */
    public void processGetRequest(String url){
        System.out.println("Processing GET request to: " + url);
    }
}
