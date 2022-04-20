package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    public int top;
    public int left;
    public int width;
    public int height;

    public void initialize (int lf, int t, int wh, int ht){
        this.left = lf;
        this.top = t;
        this.width = wh;
        this.height =ht;
    }
    public void initialize (int lf, int t){
        this.left = lf;
        this.top = t;
    }
    public void initialize (int wh){
        this.width = wh;
        this.height = width;
    }
    public void initialize (Rectangle copy){
        this.top = copy.top;
        this.left = copy.left;
        this.width = copy.width;
        this.height = copy.height;
    }

    public static void main(String[] args) {

    }
}
