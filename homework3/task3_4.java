/*
 * Задание 3.4
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Спирин Кирилл
 */
public class task3_4 {

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
        
        multyWord(str);
    }
    
    public static void multyWord(String... words){
        System.out.println("Удвоенные символы в строках:");
        String resault = "";
        for (String word: words ){
            char [] ch = new char [word.length()*2];    //Создание массива char под "двойную" строку
            for (int i = 0; i<word.length(); i++){      //Запись
                ch[2*i] = word.charAt(i);
                ch[2*i+1] = word.charAt(i);
            }
            for (int i = 0; i <word.length()*2; i++) {  //Вывод
                System.out.print(ch[i]);
                resault += ch[i];                       //Можно сложить в стролу, если метод не void, а String и вернуть resault
            }
            System.out.println();
        }
    }
}
