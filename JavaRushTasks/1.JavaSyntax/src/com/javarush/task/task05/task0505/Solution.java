package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik", 2, 2, 50);
        Cat catVaska = new Cat("Vaska", 3, 3, 60);
        Cat catMurka = new Cat("Murka", 3, 2, 50);

        if (catBarsik.fight(catVaska)) System.out.println(catBarsik + " победил");
        else System.out.println(catVaska + " победил");
        if (catVaska.fight(catMurka)) System.out.println(catVaska + " победил");
        else System.out.println(catMurka + " победил");
        if (catBarsik.fight(catMurka)) System.out.println(catBarsik + " победил");
        else System.out.println(catMurka + " победил");
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
