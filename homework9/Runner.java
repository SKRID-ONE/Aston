package homework9;

import homework9.components.*;

/**
 * 
 * @author Спирин Кирилл
 */
public class Runner {

    public static void main(String[] args) {
        
        // Сначала создаем директора
        Director director = new Director();
        
        // Создаем строитель объенкта который хотим получить и передаем директору
        CarBuilder builderCar = new CarBuilder();
        
        //Директор сам понимает какой объект надо создать
        director.constructSportsCar(builderCar);
        
        // Можем получить резульат
        Car car = builderCar.getResult();
        System.out.println("Car: "+car.getCarType()+"\n************************");
        
        // Создаем строитель другого объекта - мануала
        CarManualBuilder builderManual = new CarManualBuilder();
        
        //Снова отдаем дируктору
        director.constructSportsCar(builderManual);
        
        //Результат
        System.out.println("Мануал для машины с директором:\n"+builderManual.getResult().print());
        
        
        ////////////////////////////////////////////////////////////////////////
        // Пример паттерна "СТРОИТЕЛЬ" без "директора"
        CarBuilder builderCarSecond = new CarBuilder();
        builderCarSecond.setEngine(new Engine (3.0, 0));
        builderCarSecond.setCarType(CarType.CITY_CAR);
        builderCarSecond.setSeats(2);
        Car handsCar = builderCarSecond.getResult();
        System.out.println("Машина от стоителя: "+handsCar.getCarType());
        
        ////////////////////////////////////////////////////////////////////////
        // Пример создание машины без паттерна "СТРОИТЕЛЬ"
        Car myCar = new Car(CarType.SUV, 2, new Engine(3.0, 0), 
                    Transmission.ROBOT, new TripComputer(), new GPSNavigator());
        
        System.out.println("Просто машина: "+myCar.getCarType());

    }
    
}
