package homework9.components;

import homework9.Car;

/**
 * Бортовой компьютер - мозговой центр автомобиля.
 * @author Спирин Кирилл
 */
public class TripComputer {
    
    private Car car;
    
    public void setCar(Car car){
        this.car = car;
    }
    
    public void showFuelLevel() {
        System.out.println("Уровеь топлива: "+ car.getFuel());
    }
    
    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Engine is started");
        } else {
            System.out.println("Engine isn't started");
        }
    }
}
