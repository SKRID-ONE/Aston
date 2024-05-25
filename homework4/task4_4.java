/*
 * Задание 4.4
 */
package homework4;

import java.util.*;

/**
 *
 * @author Спирин Кирилл
 */
class Student {
    private String name;
    private String group;
    private int course;
    private int [] grades;

    public Student (String name, String group, int course, int ... grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new int [grades.length];
        
        for (int i=0; i<grades.length; i++) {
            this.grades[i] = grades[i];
        }
                
    }
    
    public String getName () {
        return name;
    }
    
    public int getCourse() {
        return course;
    }
    public double average () {
        double sum = 0;
        for (int i=0; i<grades.length; i++) {
            sum += grades[i];
        }
        return (sum/grades.length);
    }
    
    public void nextCourse(){
        course++;
    }
    
}
public class task4_4 {

    
    public static void main(String[] args) {
        Student st1 = new Student("Carl","IT",3,3,4,5);
        Student st2 = new Student("Alex","IT",3,2,3,3);
        Student st3 = new Student("John","IT",2,5,4,5);
        Student st4 = new Student("Tom","IT",2,2,2,3);
        Student st5 = new Student("Eugen","IT",2,5,5,5);
        
        List <Student> students = new ArrayList();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        
        nextYear(students);
        printStudents(students, 3);
        
    }
    
    
    private static void nextYear(List <Student> studs){
//********ConcurrentModificationException********* из-за цикла for-each 
//        for (Student st : studs) {
//            System.out.println("Check: "+st.getName());
//            if(st.average()<3){
//                studs.remove(st);
//                System.out.println(st.getName()+" is removed");
//            } else {
//                System.out.println("NEXT_COURSE");
//                st.nextCourse();
//            }
//        }

        for (int i = 0; i <studs.size(); i++) {
            System.out.println("Check: "+studs.get(i).getName()+" Ave:"+studs.get(i).average());
            
            if(studs.get(i).average()<3){
                
                System.out.println(studs.get(i).getName()+" is removed");
                studs.remove(studs.get(i));
                i--;
            } 
            else {
                System.out.println("NEXT_COURSE");
                studs.get(i).nextCourse();
                System.out.println(studs.get(i).getName()+" new course: "+studs.get(i).getCourse());
            }
        }
    }
    
    private static void printStudents(List <Student> studs, int course){
        System.out.println("Students of "+course+" course");
        for (Student st:studs) {
            if (course==st.getCourse()){
                System.out.print(st.getName()+" ");
            }
        }
        System.out.println();
    }
}
