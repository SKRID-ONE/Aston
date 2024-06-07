package homework7;

import java.util.HashMap;

/**
 *
 * @author Спирин Кирилл
 */
public class Buyer extends Thread implements IBuyer, IUseBasket  {
    private static int count = 0;
    private int localCount;
    
    private static HashMap <String, Double> goods = new HashMap<>();
    private  HashMap <String, Double> basket = new HashMap<>();
    
    public Buyer (String name) {
        super(name);
        count++;
        localCount = count;
    }

    @Override
    public void run(){
        //Пришел в магазин
        enterToMarket();
        
        //Выбор товара
        try {
            //Взял корзину
            takeBasket();
            
            //Выбрал продукты 
            Double chooseGoodsTime = (500+Math.random()*1500);
            sleep(chooseGoodsTime.intValue());
            chooseGoods();
            
            //Сложил продукты
            Double putGoodsToBasketTime = (500+Math.random()*1500);
            sleep(putGoodsToBasketTime.intValue());
            putGoodsToBasket();
        } catch (InterruptedException e) {
            throw new RuntimeException("Продукты закончились :( ");
        }
        
        //Вышел из магазина
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель "+localCount+" вошел в магазин");
    }

    @Override
    public void chooseGoods() {
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
        //Количество товаров 1...4
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
    
    
    public static void products() {
        goods.put("Milk", 90.0);
        goods.put("Bread", 50.0);
        goods.put("Water", 30.0);
        goods.put("Sugar", 40.0);
    }
}
