package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCatsCount(5);
        System.out.println(cat.catsCount);


    }
}
