package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

import java.util.concurrent.Callable;

public class Solution {
    public static void main(String[] args) {
    Cat catBarsik = new Cat("Barsik", 2, 3, 50);
    Cat catVaska = new Cat("Vaska", 3, 3, 60);
    Cat catMurka = new Cat("Murka", 4, 2, 40);

    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat (String name, int age, int weight, int strength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}