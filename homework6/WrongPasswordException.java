
package homework6;

/**
 *
 * @author Спирин Кирилл
 */
public class WrongPasswordException extends Exception {
    
    
    public WrongPasswordException() {
        System.out.println("Неверный пароль!");
    }
    
    public WrongPasswordException(String message) {
        super(message);
    }
}
