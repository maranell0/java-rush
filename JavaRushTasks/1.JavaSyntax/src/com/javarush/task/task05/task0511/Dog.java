package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    public String name;
    public int height;
    public String color;

    public void initialize (String nm) {
        this.name = nm;
    }
    public void initialize (String nm, int hght){
        this.name = nm;
        this.height = hght;
    }
    public void initialize (String nm, int hght, String cl){
        this.name = nm;
        this.height = hght;
        this.color = cl;
    }


    public static void main(String[] args) {

    }
}
