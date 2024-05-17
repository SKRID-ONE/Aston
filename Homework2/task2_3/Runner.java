/*
 * Задание 2.3
 */
package Homework2.task2_3;

/**
 * @author Спирин Кирилл
 */
public class Runner {

    
    public static void main(String[] args) {
        //Доступ к статическому внутреннему классу возможен без создания экземпляра внешнего класса       
        Computer.Processor proc = new Computer.Processor("AMD Ryzen R7 5800x");
        System.out.println(proc.getDetails());
        
        //Создать нестатическому внутреннему классу без создания экземпляра внешнего кдасса невозможен
        //Computer.RAM ram = new Computer.RAM("32Gb"); - Ошибка
        
        Computer comp = new Computer();
        Computer.RAM ram = comp.new RAM("32Gb");
        System.out.println(ram.getDetails());
        
    }
    
}
