package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    public String name;
    public int age;

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getAge () {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public static void main (String[] args) {
        Dog maik = new Dog();
        maik.name = "MaikV";
        maik.age = 7;

        maik.setName("Майк");
        maik.setAge(8);
        System.out.println(maik.getName() + " " + maik.getAge());
    }
}