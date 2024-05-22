/*
 * Задание 3.3 - изменено*
 * Выводит все уникальные строчки, а не только первую.
 * Если нужно только первую, то добавить флажок*
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author Спирин Кирилл
 */
public class task3_3 {

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
        
        onlySpecial(str);
    }
    
    public static void onlySpecial (String ... words) {
        System.out.println("Уникальные строки:");
        for (String word : words) {
            if (specialTest (word)){
                System.out.println(word);
            }
        }
    }
    
    /**
     * 
     * @param word - строка для проверки уникальности символов
     * @return true если в слове не повторяются символы
     */
    public static boolean specialTest (String word) {
        //Счетчик символа
        int k = 0;
        char [] ch = new char [word.length()];
        for (int i = 0; i<word.length(); i++){
            ch[i]=word.charAt(i);
        }
        for (int i = 0; i<word.length(); i++) {
            for(int j = 0; j<word.length(); j++) {
                if (i!=j && ch[i]==ch[j]){
                    k++;                        //Увеличивается, если существует такой же символ
                };
            }
        }
        
        return (!(k>1));
    }
}
