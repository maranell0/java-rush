package com.javarush.task.task05.task0506;

/* 
Человечки
*/

public class Person {
    public String name;
    public int age;
    public String address;
    public char sex;

    public static void main(String[] args) {
        Person personalOlya = new Person();
        personalOlya.name = "Olya";
        personalOlya.age = 34;
        personalOlya.address = "Pereslavl";
        personalOlya.sex = 'w';
    }
}
