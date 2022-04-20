package com.javarush.task.task05.task0501;

/* 
Создание кота
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public static void main (String [] args){
        Cat cat = new Cat();
        cat.name = "Barsik";
        cat.age = 5;
        cat.weight = 3;
        cat.strength = 50;

        System.out.println(cat.name + " " + cat.age + " " + cat.weight + " " + cat.strength);
    }
}
