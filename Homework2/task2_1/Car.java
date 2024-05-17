/*
 * Задание 2.1
 */
package Homework2.task2_1;

/**
 * @author Спирин Кирилл
 */
abstract class Car implements Vehicle {
    
    //Методы
    @Override
    public void start() {
        System.out.println("Whhr-mm!\nYour engine was started!");
    }

    @Override
    public void stop() {
        System.out.println("The engine is switched off.");
    }

    /*Абстрактный класс позволяет не реализовывать все методы интерфейса,
    * однако это должны сделать его потомки.
    *
    * Данный метод не реализован, т.к. в соотвествии с заданием 2.1 класс Car
    * должен быть абстрактным, соотвественно не может иметь констуктор, в 
    * котором можно было бы указать параметр fuelType. Отвественность перенесена
    * на потомка класса.
    */
    @Override
    public abstract String getFuelType();
    
    abstract int getNumberOfDoors();
    
    abstract double getTrunkCapacity();
}

