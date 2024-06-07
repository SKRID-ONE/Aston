package homework7;

public class Buyer extends Thread implements IBuyer  {

    public Buyer (String name) {
        super(name);
    }

    @Override
    public void run(){
        enterToMarket();
        chooseGoods();
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        goOut();
    }

    @Override
    public void enterToMarket() {
        System.out.println("Вошел в магазин");
    }

    @Override
    public void chooseGoods() {
        System.out.println("Выбрал товар");
    }

    @Override
    public void goOut() {
        System.out.println("Вышел из магазина");
    }

    public static void main (String [] args) {
        new Buyer("Test1").start();

    }
}
