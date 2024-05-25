/*
 * Задание 4.2
 */
package homework4;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author Спирин Кирилл
 */
public class task4_2 {

    
    public static void main(String[] args) {
        
        //2.1 Создание двусвяханного списка стран мира
        LinkedList <String> worldCountriesList = new LinkedList();
        /* Добавление списка стран мира из Enum. Возможно есть более правильный/
        простой способ. Если да - напишите в комментарий. Спасибо <3 */
        worldCountriesList.addAll(Arrays.asList(Stream.of(WorldCountries.values()).map(Enum::name).toArray(String[]::new)));
        
        //2.2 Добавить 4 страны
        worldCountriesList.addFirst("Atlantida");
        worldCountriesList.addFirst("Dreamland");
        worldCountriesList.addLast("Zobmieland");
        worldCountriesList.addLast("MilkAndCholateLand");
        
        //Вывод на экран
        System.out.println(worldCountriesList);
        
        //2.3 Удалить 2 элемента
        worldCountriesList.removeFirst();
        worldCountriesList.removeLast();
        
        //2.4 Получить по одному элементу с начала и конца списка
        System.out.println("The first elements: "+worldCountriesList.getFirst());
        System.out.println("The last elements: "+worldCountriesList.getLast());
        
    }
    
}
