/*
 * Задание 3.2
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Спирин Кирилл
 */
public class task3_2 {

    public static void main(String[] args) {
        
        //Количество строк принимаемые с клавиатуры
        int nStr = 3;
        
        //Ввод
        Scanner sc = new Scanner(System.in);
        String [] str = new String [nStr];
        for (int i = 0; i < nStr; i ++) {
            System.out.println("Введите строку № "+(i+1));
            str[i] = sc.nextLine();
        }
        
        //Вывод
        System.out.println("Введенные строчки: ");
        for (int i = 0; i < nStr; i ++) {
            System.out.println(str[i]);
        }
//        System.out.println("Median is "+getMedian(str));
        
        getLowThanMedian(str);
    }
    
    public static int getMedian(String ... words) {
        int median = 0;
        for (String word : words) {
            median += word.length();
        }
        return median/words.length;
    }
    
    public static void getLowThanMedian(String ... words) {
        int median = getMedian(words);
        System.out.println("Median is "+median);
        
        for (String word : words) {
            if (word.length()<median) {
                System.out.println(word+" length: "+word.length());
            }
        }
    }
    
}
