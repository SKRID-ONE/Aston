/*
 * Задание 6.2
 */
package homework6;

import java.io.*;

/**
 *
 * @author Спирин Кирилл
 */
public class task6_2 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Создание файла
        File tms = new File("tms.txt");
        tms.createNewFile();
        
        //Чтение с консоли
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader  br = new BufferedReader(isr);
        
        //Запись в файл
        try (FileOutputStream fos = new FileOutputStream(tms)) {
            fos.write(br.readLine().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //Чтение строки из файла
        try (FileInputStream fis = new FileInputStream(tms)){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read()) != -1) {
                
                //Замена пробела на нижнее подчеркивание
                if ((char)bytesRead == ' '){
                    bytesRead = '_';
                }
                System.out.print((char)bytesRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
