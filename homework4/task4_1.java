/*
 * Задание 4.1
 */
package homework4;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author Спирин Кирилл
 */
public class task4_1 {
    
    public static void main(String[] args) {
                  
        //1.1 Создание коллекции стран мира
        
        List <String> worldCountriesList = new ArrayList();
        /* Добавление списка стран мира из Enum. Возможно есть более правильный/
        простой способ. Если да - напишите в комментарий. Спасибо <3 */
        worldCountriesList.addAll(Arrays.asList(Stream.of(WorldCountries.values()).map(Enum::name).toArray(String[]::new)));
        
        
        //1.2 Добавить 3 страны
        worldCountriesList.add("Atlantida");
        worldCountriesList.add("Dreamland");
        worldCountriesList.add("Zobmieland");
        
        //Вывод на экран
        System.out.println(worldCountriesList);
        
        //1.3 Заменить второй элемент
        worldCountriesList.set(1, "SUPER country");
        
        //1.4 Удаление второго элемента по индексу 
        worldCountriesList.remove(1);
        
        //1.5 Удаление по ключу
        worldCountriesList.remove("Afghanistan");
        
        //1.6 Определение индекса по ключу
        System.out.println("Индекс страны Algeria: "+worldCountriesList.indexOf("Algeria"));
        
        //1.7 Проверка содержания элемента в листе
        System.out.println("Содержится ли Antarctica: "+worldCountriesList.contains("Antarctica"));;

    }
}
