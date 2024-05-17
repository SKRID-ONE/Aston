/*
 * Задание 2.1
 */
package Homework2.task2_1;

/**
 * @author Спирин Кирилл
 */
public class Sedan extends Car {
    
    //Переменные
    private int nOfDoors;
    private String fuelType;
    private String LuxLvl;
    private double trunkCapacity;
    
    /**
     * Конструктор
     * @param nOfDoors  количество дверей
     * @param fuelType  тип топлива
     * @param LuxLvl  класс роскоши 
     * @param trunkCapacity  объем топливного бака
     */
    public Sedan (int nOfDoors, String fuelType, String LuxLvl, double trunkCapacity) {
        this.fuelType = fuelType;
        this.nOfDoors = nOfDoors;
        this.LuxLvl = LuxLvl;
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
    
    public String getLuxuryLevel(){
        return LuxLvl;
    }
    
}
