package bsu.rfe.java.group6.lab1.Vernicovskiy.varA7;

public class Cheese extends Food {
    public Cheese(){
        super ("Сыр"); //при каждом вызове конструктора порожденного класса вызывается и конструктор родительского класса
    }

    public void consume(){
        System.out.println(getName() + " съеден"); // можно заменить getName() на this(он ведь хранит ссылку)
    }

}