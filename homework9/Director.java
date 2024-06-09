package homework9;

import homework9.components.*;

/**
 * В классе "директоре" создаются все возможные варианты строительства.
 * 
 * Особенность класса в том, что ему можно передать лубой экзепляр 
 * реализуеющий интерфейс Builer. В зависимости от переданного экземпляра 
 * будет произвден конкретный продукт. (В нашем случае - машина или мануал).
 * 
 * @author Спирин Кирилл
 */
public class Director {
    
    //Создаем варианты создания автомобилей и их особенности:
    
    //Спортивный автомобиль
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.ROBOT);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    
    //Городской автомобиль
    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.6, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    
    //Внедорожный автомобиль
    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
    
    //Маленький автомобиль
    public void miniCar (Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        //Можно заметить, что отсутсвует GPS навигатор и бортовой компьютер
        //Демонстрация вариативности опций*
    }
}
