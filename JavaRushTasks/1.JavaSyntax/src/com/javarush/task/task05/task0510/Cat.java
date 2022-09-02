package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    public String name;
    public int age;
    public int weight;
    public String color;
    public String address;
    
    public void initialize (String name) {
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "Black";
    }
    public void initialize (String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }
    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "Black";
    }
    public void initialize (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }
    public void initialize (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }
    
    
}
