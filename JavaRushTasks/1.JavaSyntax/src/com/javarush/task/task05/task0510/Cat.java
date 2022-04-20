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
    
    public void initialize (String nm) {
        this.name = nm;
        this.age = 3;
        this.weight = 3;
        this.color = "Black";
    }
    public void initialize (String nm, int w, int a) {
        this.name = nm;
        this.age = a;
        this.weight = w;
        this.color = "Black";
    }
    public void initialize (String nm, int a) {
        this.name = nm;
        this.age = a;
        this.weight = 3;
        this.color = "Black";
    }
    public void initialize (int w, String c) {
        this.weight = w;
        this.color = c;
        this.age = 3;
    }
    public void initialize (int w, String c, String a) {
        this.weight = w;
        this.color = c;
        this.address = a;
        this.age = 3;
    }
    
    
}
