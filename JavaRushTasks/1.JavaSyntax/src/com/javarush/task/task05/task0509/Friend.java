package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    public String name;
    public int age;
    public char sex;

    public void initialize (String a) {
        this.name = a;
    }
    public void initialize (String a, int b) {
        this.name = a;
        this.age  = b; 
    }
    public void initialize (String a, int b, char c) {
        this.name = a;
        this.age  = b;
        this.sex  = c;
    }
    
    public static void main(String[] args) {

    }
}
