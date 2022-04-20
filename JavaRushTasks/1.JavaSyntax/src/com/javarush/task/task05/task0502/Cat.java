package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        
    }

    public boolean fight(Cat anotherCat) {
        int pointsFirstCat = 0;
        int pointsSecondCat = 0;
        if (this.age > anotherCat.age) pointsFirstCat++;
        else if (this.age == anotherCat.age){
            pointsFirstCat++;
            pointsSecondCat++;
        }
        else pointsSecondCat++;
        if (this.weight > anotherCat.weight) pointsFirstCat++;
        else if (this.weight == anotherCat.weight){
            pointsFirstCat++;
            pointsSecondCat++;
        }
        else pointsSecondCat++;
        if (this.strength > anotherCat.strength) pointsFirstCat++;
        else if (this.strength == anotherCat.strength){
            pointsFirstCat++;
            pointsSecondCat++;
        }
        else pointsSecondCat++;
        return pointsFirstCat > pointsSecondCat;
    }
    public static void main (String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 10;
        cat1.strength = 10;

        Cat cat2 = new Cat();
        cat2.age = 1;
        cat2.weight = 10;
        cat2.strength = 10;

        System.out.println(cat1.fight(cat2));
    }

}
