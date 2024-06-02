package homework6;

/**
 *
 * @author Спирин Кирилл
 */
public class WrongLoginException extends Exception {
    
    
    public WrongLoginException() {
        System.out.println("Неверное имя пользователя!");
    }
    
    public WrongLoginException(String message) {
        super(message);
    }
}
