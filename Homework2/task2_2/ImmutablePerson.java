/*
 * Задание 2.2
 */
package Homework2.task2_2;

import java.util.Collections;
import java.util.List;

/**
 * @author Спирин Кирилл
 */
public final class ImmutablePerson {
    
    //Переменные
    final String name;      //Модификатор доступа private отсутсует для наглядности
    private final int age;
    private final List <String> hobbies;

     
    
    
    //Конструктор
    ImmutablePerson(String name, int age, List <String> hobbies){
        this.name = name;
        this.age = age;
        //Спасибо за подсказку на лекции =)
        this.hobbies = Collections.unmodifiableList(hobbies);
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
}
