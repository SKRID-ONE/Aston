/*
 * Задание 2.2
 */
package Homework2.task2_2;

import java.util.List;

/**
 * @author Спирин Кирилл
 */
public class MutablePerson {
    
    //Переменные
    private String name;
    private int age;
    private List <String> hobbies;
    
    //Конструктор
    MutablePerson(String name, int age, List <String> hobbies){
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
    
    
    //Методы
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge (int age){
        this.age = age;
    }
    
    /**
     * 
     * @param hobby - добавить хобби в лист.
     */
    public void addHobby(String hobby){
        hobbies.add(hobby);
    }
    
    
}