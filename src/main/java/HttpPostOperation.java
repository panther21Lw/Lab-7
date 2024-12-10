/**
 * Клас, який реалізує обробку HTTP POST запитів. 
 * Цей клас відповідає за логіку, пов'язану з виконанням POST запиту до заданої URL-адреси 
 * з відповідними даними (payload), які передаються в тілі запиту.
 */
public class HttpPostOperation {
    
    /**
     * Обробляє HTTP POST запит до заданої веб-адреси з вказаним payload.
     * Цей метод виводить інформацію про запит на консоль.
     * 
     * @param url Строкова веб-адреса, до якої буде виконано POST запит.
     * @param payload Строкові дані (payload), які будуть передані в тілі POST запиту.
     */
    public void processPostRequest(String url, String payload){
        System.out.println("Processing POST request to: " + url + " with payload: " + payload);
    }
}