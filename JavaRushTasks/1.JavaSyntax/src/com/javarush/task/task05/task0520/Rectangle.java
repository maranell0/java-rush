package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    public int top;
    public int left;
    public int width;
    public int height;

    public Rectangle (int lf, int t, int wh, int ht){
        this.left = lf;
        this.top = t;
        this.width = wh;
        this.height =ht;
    }
    public Rectangle (int lf, int t){
        this.left = lf;
        this.top = t;
    }
    public Rectangle (int wh){
        this.width = wh;
        this.height = width;
    }
    public Rectangle (Rectangle copy){
        this.top = copy.top;
        this.left = copy.left;
        this.width = copy.width;
        this.height = copy.height;
    }

    public static void main(String[] args) {

    }
}
