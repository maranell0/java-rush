package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    //напишите тут ваш код
    public int centerX;
    public int centerY;
    public int radius;
    public int width;
    public int color;

    public void initialize (int cX, int cY, int rd) {
        this.centerX = cX;
        this.centerY = cY;
        this.radius = rd;
    }
    public void initialize (int cX, int cY, int rd, int wh){
        this.centerX = cX;
        this.centerY = cY;
        this.radius = rd;
        this.width = wh;
    }
    public void initialize (int cX, int cY, int rd, int wh, int clr){
        this.centerX = cX;
        this.centerY = cY;
        this.radius = rd;
        this.width = wh;
        this.color =clr;
    }

    public static void main(String[] args) {

    }
}
