package homework9.components;

/**
 * GPS навигатор - ориентирует автомобиль в пространстве в системе координат.
 * @author Спирин Кирилл
 */
public class GPSNavigator {
    
    private String route;
    
    public  GPSNavigator() {
        this.route = "Russia, Moscow";
    }
    
    public  GPSNavigator(String route) {
        this.route = route;
    }
    
    public String getRoute(){
        return route;
    }
}
