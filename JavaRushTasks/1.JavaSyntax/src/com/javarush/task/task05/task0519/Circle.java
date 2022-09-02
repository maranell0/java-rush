package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/

public class Circle {
    //напишите тут ваш код
    public int centerX;
    public int centerY;
    public int radius;
    public int width;
    public int color;

    public Circle (int cX, int cY, int rd) {
        this.centerX = cX;
        this.centerY = cY;
        this.radius = rd;
    }
    public Circle (int cX, int cY, int rd, int wh){
        this.centerX = cX;
        this.centerY = cY;
        this.radius = rd;
        this.width = wh;
    }
    public Circle (int cX, int cY, int rd, int wh, int clr){
        this.centerX = cX;
        this.centerY = cY;
        this.radius = rd;
        this.width = wh;
        this.color =clr;
    }

    public static void main(String[] args) {

    }
}
