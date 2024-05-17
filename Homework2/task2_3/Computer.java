/*
 * Задание 2.3
 */
package Homework2.task2_3;

/**
 * @author Спирин Кирилл
 */
public class Computer {
    
    //Вложенный (статический) класс 
    static class Processor {
        
        //Переменные
        String model;
        
        //Конструктор
        Processor(String model){
            this.model = model;
        }
        
        //Методы
        String getDetails(){
            return model;
        }
        
    }
    
    //Внутренний класс (Вложенный нестатический)
    class RAM {
        
        //Переменные
        String size;
        
        //Конструктор
        RAM(String size){
            this.size = size;
        }
        
        //Методы
        String getDetails(){
            return size;
        }
    }
}
