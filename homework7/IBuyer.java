package homework7;

public interface IBuyer {

    void enterToMarket();   // Вошел в магазин - мгновенно
    void chooseGoods();     // Выбор товара - 0.5 - 2 секунды
    void goOut();           // Вышел из магазина - мгновенно
}
