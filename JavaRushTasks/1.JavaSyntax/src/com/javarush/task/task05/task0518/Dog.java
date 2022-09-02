package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код
    public String name;
    public int height;
    public String color;

    public Dog (String nm) {
        this.name = nm;
    }
    public Dog (String nm, int hght){
        this.name = nm;
        this.height = hght;
    }
    public Dog (String nm, int hght, String cl){
        this.name = nm;
        this.height = hght;
        this.color = cl;
    }

    public static void main(String[] args) {

    }
}
