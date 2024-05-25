/*
 * Задание 3.1
 * Я не против, если покажут на лекции. Два метода ввода с клавиатуры. 
 * Использование чистого String.
 * Использование методов с переменной длинной аргументов для определения min, max.
 * P.S. методы из головы, но думаю велосипед - есть велосипед, м.б. в сети что-то похожее.
 */
package homework3;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Спирин Кирилл
 */
public class task3_1 {

    public static void main(String[] args) throws IOException {
        //Два метода ввода с клавиатуры:
        //Scaner и написание метода getString() по Шилдту
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите строку № 1");
        String str1 = sc.nextLine();
        System.out.println("Введите строку № 2");
        String str2 = getString();
        System.out.println("Введите строку № 3");
        String str3 = getString();
        maxString(str1, str2, str3);
        minString(str1, str2, str3);
    }
    
    
    //Собственный метод для чтение строки по Шилдту
    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        return input;
    }
    
    //void - для наглядности, в идеале возвращать String
    private static void maxString(String ... words){
        String maxN = words[0];
        for (String word : words) {
            if (maxN.length()<word.length()) {
                maxN = word;
            }
        }
        System.out.println("Max String: " + maxN+" length: " + maxN.length());    
    }
    
    private static void minString(String ... words){
        String maxN = words[0];
        for (String word : words) {
            if (maxN.length()>word.length()) {
                maxN = word;
            }
        }
        System.out.println("Min String: " + maxN+" length: " + maxN.length());    
    }
}
