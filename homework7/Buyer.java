package homework7;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Спирин Кирилл
 */
public class Buyer extends Thread implements IBuyer, IUseBasket  {
    
    private static int count = 0;
    private int localCount;
    
    private static final HashMap <String, Double> goods = new HashMap<>();
    private HashMap <String, Double> basket = new HashMap<>();
    
    public Buyer (String name) {
        super(name);
        count++;
        localCount = count;
    }

    @Override
    public void run(){
        //Пришел в магазин
        enterToMarket();
        
        //Взял корзину
        takeBasket();

        //Выбрал продукты 
        chooseGoods();

        //Сложил продукты
        putGoodsToBasket();
     
        //Вышел из магазина
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель "+localCount+" вошел в магазин");
    }

    @Override
    public void chooseGoods() {
        //Время на операцию 0,5...2 секунды
        Double chooseGoodsTime = (500+Math.random()*1500);
        try {
            sleep(chooseGoodsTime.intValue());
        } catch (InterruptedException ex) {
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Покупатель "+localCount+" выбрал товар");
    }

    @Override
    public void goOut() {
        System.out.println("Покупатель "+localCount+" вышел из магазин");
    }

    @Override
    public void takeBasket() {
        System.out.println("Покупатель "+localCount+" взял корзину");
    }

    @Override
    public void putGoodsToBasket() {
        //Время на операцию 0,5...2 секунды
        Double putGoodsToBasketTime = (500+Math.random()*1500);
        try {
            sleep(putGoodsToBasketTime.intValue());
        } catch (InterruptedException ex) {
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Рандомное количество товаров 1...4
        Double nGoods = (1+Math.random()*4);
        int nGoodsInt = nGoods.intValue();
        
        //Рандомный выбор продуктов из списка
        for (int i = 0; i< nGoodsInt; i++) {
            Double product = (1+Math.random()*4);
            int productInt = product.intValue();
            
            switch (productInt) {
                case 1: basket.put("Milk",goods.get("Milk"));
                    break;
                case 2: basket.put("Bread",goods.get("Bread"));
                    break;
                case 3: basket.put("Water",goods.get("Water"));
                    break;
                case 4: basket.put("Sugar",goods.get("Sugar"));
                    break;
            }
        }
        
        System.out.println("Товары покупателя "+localCount+" :"+basket);    
    }
    
    
    /**
     * Метод заполняет HashMap продуктами.
     */
    public static void setProducts() {
        goods.put("Milk", 90.0);
        goods.put("Bread", 50.0);
        goods.put("Water", 30.0);
        goods.put("Sugar", 40.0);
    }
}
