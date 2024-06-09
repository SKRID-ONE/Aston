package homework9;

import homework9.components.*;

/**
 * Автомобиль - средство передвижение (или всё таки роскошь?)
 * @author Спирин Кирилл
 */
public class Car {
    
    private final CarType carType;
    private final int nSeats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;
    
    public Car (CarType carType, int nSeats, Engine engine, Transmission transmissoin,
    TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.nSeats= nSeats;
        this.engine = engine;
        this.transmission = transmissoin;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }
    
    public CarType getCarType(){
        return carType;
    }
    
    public double getFuel(){
        return fuel;
    }
    
    public int getSeats(){
        return nSeats;
    }
    
    public Engine getEngine(){
        return engine;
    }
    
    public Transmission getTransmission(){
        return transmission;
    }
    
    public TripComputer getTripComputer(){
        return tripComputer;
    }
    
    public GPSNavigator getGPSNavigator(){
        return gpsNavigator;
    }
    
    public void setFuel(double fuel) {
        this.fuel += fuel;
    }
}
