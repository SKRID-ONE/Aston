package homework9;

import homework9.components.*;

/**
 * Интерфейс Строителя - объявляет все возможные конфигурации автомобиля.
 * @author Спирин Кирилл
 */
public interface Builder {
    
    void setCarType(CarType type);
    void setSeats(int nSeats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    
}
