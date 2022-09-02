package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;


    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //напишите тут ваш код
        // Мой код в полном виде
        this.x = x;
        this.y = y;
        this.radius = 10;
    }
    public Circle (double radius) {
        this.x = 1;
        this.y = 2;
        this.radius = radius;
    }
    public Circle () {
        this.x = 0;
        this.y = 0;
        this.radius = 10;
    }
    /* Код Егора в сокращенном виде
        this(x, y, 10); /////////////  НАПИСАЛ ТОЛЬКО ЭТУ СТРОКУ
    }

    public Circle() {
        this(5, 5, 1);
    }


    public Circle(double radius) {
        //напишите тут ваш код
        this(0, 0, radius); /////////////  НАПИСАЛ ТОЛЬКО ЭТУ СТРОКУ
    }

    */

    public static void main(String[] args) {

    }
}