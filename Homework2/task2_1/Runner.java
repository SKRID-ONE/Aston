/*
 * Задание 2.1
 */
package Homework2.task2_1;

/**
 * @author Спирин Кирилл
 */
public class Runner {

    public static void main(String[] args) {
        
        Sedan sedan = new Sedan(5, "AI-95", "First", 80.0);
        Truck truck = new Truck(5, "DT", 10, 80.0);
        
        sedan.start();
        System.out.println("Тип используемого топлива: "+sedan.getFuelType());
        System.out.println("Класс роскоши: "+sedan.getLuxuryLevel());
        System.out.println("Количество дверей: "+sedan.getNumberOfDoors());
        System.out.println("Объем топливного бака, литров: "+sedan.getTrunkCapacity());
        sedan.stop();
        
        System.out.println("**************************************************");
        truck.start();
        System.out.println("Тип используемого топлива: "+truck.getFuelType());
        System.out.println("Максимальная грузоподъемность, тонн: "+truck.getMaxLoadCapacity());
        System.out.println("Количество дверей: "+truck.getNumberOfDoors());
        System.out.println("Объем топливного бака, литр: "+truck.getTrunkCapacity());
        truck.stop();
    }
    
}
