package homework9.components;

/**
 *  Двигатель - сердце любого автомобиля!
 * @author Спирин Кирилл
 */
public class Engine {
    
    private final double volume;
    private double mileage;
    private boolean started;
    
    public Engine(double volume, double mileage){
        this.volume = volume;
        this.mileage = mileage;
    }
    
    public void on(){
        started = true;
    }
    
    public void off(){
        started = false;
    }
    
    public boolean isStarted(){
        return started;
    }
    
    public void go(double mileage){
        if (started) {
            this.mileage += mileage;
        } else {
            System.out.println("Вы не можете никуда поехать, двигатель заглушен");
        }
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getMileage(){
        return mileage;
    }
}
