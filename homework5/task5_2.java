/*
 * Задание 5.2
 */
package homework5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Спирин Кирилл
 */
class Employee implements Comparable {
    //Переменные
    private String name;
    private int age;
    private String department;
    private int salary_$;
    
    //Конструктор
    public Employee (String name, int age, String department, int salary_$) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary_$ = salary_$;
    }
    
    //Методы
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getDep() {
        return department;
    }

    public int getSalary() {
        return salary_$;
    }
    
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Object o) {
        return age;
    }




}

public class task5_2 {

    public static void main(String[] args) {
        
        //2.1 Создать список сотруднкиов
        Employee emp1 = new Employee ("Alex", 23, "IT", 1000);
        Employee emp2 = new Employee ("John", 24, "IT", 1100);
        Employee emp3 = new Employee ("Anna", 19, "HR", 800);
        Employee emp4 = new Employee ("Nelson", 20, "HR", 900);
        Employee emp5 = new Employee ("Eugen", 31, "IT", 1500);
        Employee emp6 = new Employee ("Helena", 33, "HR", 1200);
        
        List <Employee> emps =  new ArrayList<Employee> ();
        
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(emp5);
        emps.add(emp6);
        //Напишите в кооментарий, если есть способ побыстрее/красивее. Спасибо <3
        
        //2.2 Старше 30, отсортированы по возрастанию
        olderThirty(emps);
        
        //2.3 Работающие в отделе "IT" - количество
        nDepartment(emps, "IT");
        
        //2.3 Работкник с максимальной ЗП
        maxSalary(emps);
    }
    
    
    /**
     * Выводит в консоль список сотрудников старше 30.
     * @param emps Лист объектов Employee
     */
    private static void olderThirty(List<Employee> emps) {
        System.out.println("Список сотрудников страше 30:");
        emps.stream()
                .filter(e -> e.getAge()>30)
                .sorted()   //Использование Comparable.compareTo()
                //.sorted((e1, e2) -> e1.getAge() - e2.getAge()) - без использования Comparable.compareTo()
                .forEach(System.out::println);
                
    }
    
    /**
     * Выводит в консоль количество работников в отделе.
     * @param emps Лист объектов Employee
     * @param department Отдел в котором необходимо узнать количество работников
     */
    private static void nDepartment (List<Employee> emps, String department) {
        System.out.println("Работников в отделе "+department+": "+emps.stream()
                .filter(e->e.getDep().equals(department))
                .count());
    }
    
    /**
     * Выводит в консоль работника с самой большой ЗП.
     * @param emps Лист объектов Employee
     */
    private static void maxSalary (List<Employee> emps) {
        System.out.println("Работник с самой большой ЗП: "+
        emps.stream()
                .max((e1, e2)-> e1.getSalary() - e2.getSalary())
                .get());
    }
}
