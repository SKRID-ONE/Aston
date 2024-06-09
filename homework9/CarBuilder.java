package homework9;

import homework9.components.*;

/**
 * Строитель автомобилей
 * @author Спирин Кирилл
 */
public class CarBuilder implements Builder {
    
    private CarType carType;
    private int nSeats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int nSeats) {
        this.nSeats = nSeats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
    
    public Car getResult() {
        return new Car (carType, nSeats, engine, transmission, tripComputer, gpsNavigator); 
    }
}
