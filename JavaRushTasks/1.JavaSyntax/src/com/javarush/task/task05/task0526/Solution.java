package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man m1 = new Man("Vasya", 55, "Soha");
        Man m2 = new Man("Kolya", 30, "4ikago");

        Woman w1 = new Woman("Zhanna", 44, "Sokolka");
        Woman w2 = new Woman("Katya", 22, "Shestoy");

        m1.output();
        m2.output();

        w1.output();
        w2.output();
    }

    public static class Man {
        String name;
        int age;
        String address;
        
        public Man(String a, int b, String c) {
            this.name = a;
            this.age = b;
            this.address = c;
        }
        
        public void output() {
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
    
    public static class Woman {
        String name;
        int age;
        String address;
        
        public Woman(String a, int b, String c) {
            this.name = a;
            this.age = b;
            this.address = c;
        }
        
        public void output() {
            System.out.println(this.name + " " + this.age + " " + this.address);
        }
    }
    //напишите тут ваш код
}
