/*
 * Задание 6.1
 */
package homework6;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Спирин Кирилл
 */
class User {

    private final String login;
    private final String password;
    private final String confirmPassword;
    
    // Приватный конструктор
    private User (String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    
    @Override
    public String toString() {
        return login;
    }  
    
    /**
     * Метод проверяет правильность введенных данных и вызывает конструктор User
     * @param login Логин должен быть короче 20 символов
     * @param password Пароль должен быть короче 20 символов, не содержать 
     * пробелов, содержать хотя бы одну цифру.
     * @param confirmPassword Должен соотвествовать паролю.
     * @return  Объект класса User
     * @throws WrongLoginException Неверный логин
     * @throws WrongPasswordException  Неверный пароль
     */
    public static User newUser (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        
        if (login.length()>20||login == null) {
            throw new WrongLoginException("Неверное имя пользователя!");
        } else if (password.length()>20 || !password.equals(confirmPassword) || password.contains(" ") || !checkNumber(password) || (password == null)) {
            throw new WrongPasswordException("Неверный пароль!");
        } else {
            User user = new User(login, password, confirmPassword);
            System.out.println("User "+login+" was created!");
            return user;
        }
    }
    
    /**
     * Метод проверяет наличие цифр 0-9 в строке.
     * @param password - Строка, пароль.
     * @return True если содежит цифру 0-9.
     */
    private static boolean checkNumber (String password) {
        boolean n = false;
        for (Integer i = 0; i<10; i++) {
            if (password.contains(i.toString())){
                n = true;
            }
        }
        return n;
    }
    
}


public class task6_1 {

    
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        List Users = new ArrayList();
        Users.add(User.newUser("Alex","123456","123456"));
        Users.add(User.newUser("Helena","password1","password1"));
        System.out.println("Users list: "+Users);
        
        //WrongPasswordException
        Users.add(User.newUser("John","password","123456"));
        
        /*Уже не добавится, т.к. до этого вылетит ошибка.
        * Можно ли как-то обработать ошибку таким образом, чтобы программа
        * выполнялась дальше? Напишите в комментарий. Заранее спасибо <3
        */
        Users.add(User.newUser("Maxim","password1","password1"));
    }
    
}
