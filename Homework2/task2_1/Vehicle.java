/*
 * Задание 2.1
 */
package Homework2.task2_1;

/**
 * @author Спирин Кирилл
 */
public interface Vehicle {

    
    void start();
   
    void stop();
   
    /** 
    * 
    * @return Метод возращает тип используемого топлива.
    */
    String getFuelType();
}
