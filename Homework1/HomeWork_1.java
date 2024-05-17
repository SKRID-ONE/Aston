package Homework1;

/*
1. Создайте несколько классов с разными полями, конструкторами и методами.
2. Практикуйтесь в использовании статических и нестатических блоков инициализациии.
3. Попробуйте различные варианты установки значений свойств объектов: через конструктор,
сеттеры, и непосредственное присваивание значений полям объектов.
4. Реализуйте перегрузку методов в ваших классах и попробуйте вызвать разные версии перегруженных методов.
 */

/**
 * @author Спирин Кирилл
 */

class Monkey {
    //Характеристики объекта
    protected int age;
    private int maxLifeTimeYear;
    private String color;
    static int count;
    
    //Конструкторы:
    public Monkey(){
        System.out.println("I was borned!");
        count++;
    }
    
    public Monkey(int age, String color){
        this.age = age;
        this.color = color;
        maxLifeTimeYear = 30;
        count++;
    }
    
    //Методы(поведение)
    public void voice () {
        System.out.println("Ua-a-a!");
    }
    
    public void addLifeTime () {
        maxLifeTimeYear+=10;
    }
    
    public int  lifeTime() {
        return (maxLifeTimeYear-age);
    }
    
    public static int sum(int a, int b){
        return a+b;
    }
}
//Наследование!
class Homosapien extends Monkey {
    //Характеристики объекта
    private String clothes;
    //Конструкторы:
    public Homosapien (){
        super();
        super.addLifeTime();
        count++;
    }
    
    public Homosapien (int age, String color, String clothes){
        super(age, color);
        this.clothes = clothes;
        super.addLifeTime();
        count++;
    }
    //Переопределение метода
    @Override
    public void voice () {
        System.out.println("Rhhh");
    }
}

class Human extends Homosapien {
    //Характеристики объекта
    private String name;
    //Конструкторы:
    public Human (){
        super();
        super.addLifeTime();
        count++;
    }
    
    public Human (int age, String color, String clothes, String name){
        super(age, color, clothes);
        super.addLifeTime();
        this.name = name;
        count++;
    }
    
    //Статическое поле
    static {
        System.out.println("I'm a HUMAN!");
    }
    //Не статическое поле 
    {
        System.out.println("Non-static area");
    }
    //Переопределение метода    
    @Override
    public void voice () {
        System.out.println("Hello!");
    }
    
    //Перегрузка метода
    public void voice (String phrase) {
        System.out.println(phrase);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName () {
        return name;
    }
    
    
}

public class HomeWork_1 {
    
    public static void main(String[] args) {
        Monkey mon1 = new Monkey();
        mon1.age = 4;                                   //Непосредственное присваивание,т.к. protected 
        mon1.voice();
        System.out.println(mon1.lifeTime());
        
        Monkey monPlusPlus = new Homosapien();
        monPlusPlus.voice();
                
        Human h1 = new Human(23, "white", "Uniform", "Alex");
        Human h2 = new Human(24, "black", "Uniform", "John");
        System.out.println(h1.getName());
        System.out.println(h2.getName());
        System.out.println("Life time is "+ h1.lifeTime());
        
        System.out.println("Number of living beings: " + Monkey.count); //Вызов статической переменной без создание объекта
        
        
        h1.voice();
        h1.voice("Good bye");
        
        h1.setName("Conor");                            //Использование сеттера
        System.out.println(h1.getName());
     } 
}
