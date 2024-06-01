/*
 * Задание 5.1
 */
package homework5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 * @author Спирин Кирилл
 */
public class task5_1 {

    
    public static void main(String[] args) {
        
        //1.1 Создание коллецкии Integer и заполнение числами.
        List <Integer> integerList = new ArrayList(List.of(1,2,3,4,5,5,2,3,4,8,7,8,9,4,1));
        
        Integer streamIntegerList = integerList.stream()
                .distinct()                 //1.2 Удалить дубликаты
                .filter(i -> i%2==0)        //1.3 Только четные
                .mapToInt(i -> i.intValue())
                .sum();                     //1.4 Сумма
                
        System.out.println(streamIntegerList);
    }
    
}
