/*
 * Задание 2.1
 */
package Homework2.task2_1;

/**
 * @author Спирин Кирилл
 */
public class Truck extends Car {
    
    //Переменные
    private int nOfDoors;
    private String fuelType;
    private double maxLoad;
    private double trunkCapacity;
    
    /**
     * Конструктор
     * @param nOfDoors  количество дверей
     * @param fuelType  тип топлива
     * @param maxLoad  максимальная грузоподъемность (тонн)
     * @param trunkCapacity  объем топливного бака
     */
    public Truck (int nOfDoors, String fuelType, double maxLoad, double trunkCapacity) {
        this.fuelType = fuelType;
        this.nOfDoors = nOfDoors;
        this.maxLoad = maxLoad;
        this.trunkCapacity = trunkCapacity;
    }
    
    //Методы
    @Override
    int getNumberOfDoors() {
        return nOfDoors;
    }

    @Override
    double getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
    
    public double getMaxLoadCapacity(){
        return maxLoad;
    }
    
}