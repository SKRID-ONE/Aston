package homework7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Спирин Кирилл
 */
public class task7_1 {
    
    private static final int WORKTIME = 120;
    
    public static void  main (String [] args) {
        
        //Наполнить "полки" продуктами
        Buyer.setProducts();
        
        for (int i = 0; i < WORKTIME; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("****SECOND: "+i+" ****");
                
                //Создание 0...2 покупателяв секунду.
                createBuyers();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(task7_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Метод создаёт от 0 до 2 экзепляров класса Buyer.
     */
    private static void createBuyers() {
        Double x = (Math.random()*3);
        int nBuyer = x.intValue(); //Псевдорандомное целое число от 0 до 2
//        System.out.println(nBuyer);
        for (int i = 0; i < nBuyer; i ++) {
            new Buyer("Buyer").start();
        }
    }
}
