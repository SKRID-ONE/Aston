/*
 * Задание 2.2
 */
package Homework2.task2_2;

import java.util.*;

/**
 * @author Спирин Кирилл
 */
public class Runner {

    public static void main(String[] args) {
        
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Coding");
        hobbies.add("Guitar");
        hobbies.add("Piano");
        hobbies.add("Video games");
        
        MutablePerson per_1 = new MutablePerson("John", 26, hobbies);
        
        ImmutablePerson per_2 = new ImmutablePerson("Alex", 27, hobbies);
        
        per_1.setName("Jack");
        per_1.setAge(23);
        per_1.addHobby("Ski");
        
        //per_2.name = "Alex"; - Ошибка
        /*
            per_2 - имеет final переменные, и не имеет методы set();
        ->  per_2 - неизменяемый класс.
        */
    }
}
