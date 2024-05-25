/*
 * Задание 4.3
 */
package homework4;

import java.util.HashSet;

//3.1 Создание класса Person
/**
 *
 * @author Спирин Кирилл
 */
class Person {
    private final String firtstName;
    private final String secondName;
    private int age;
    
    public Person(String firtstName,String secondName, int age){
        this.firtstName = firtstName;
        this.secondName = secondName;
        this.age = age;
    }
    
    public String getFirstName () {
        return firtstName;
    }
    
    public String getSecondName () {
        return secondName;
    }
    
    public int getAge(){
        return age;
    }
}
public class task4_3 {

    public static void main(String[] args) {
        
        //3.2Создание HashSet в main
        HashSet <Person> personal = new HashSet();
        
        //3.3 Добавление 3-х объектов Person в HashSet
        Person p1 = new Person("John", "Connor", 21);
        Person p2 = new Person("Sara", "Connor", 39);
        Person p3 = new Person("T-800", "Cyberdyne Systems", 1);
        
        personal.add(p1);
        personal.add(p2);
        personal.add(p3);
        
        //Вывод на экран
        for (Person p : personal) {
            System.out.println("First name:"+p.getFirstName()+"\nSecond name: "+p.getSecondName()+"\nAge: "+ p.getAge());
        }
        
        personal.remove(p1);
        personal.remove(p2);
        
        //3.4 Проверка отсуствия удаленных объектов
        if (!personal.contains(p1)&& !personal.contains(p2)) {
            System.out.println("T-800: All targets are terminated.");
        }
        
    }
    

}

