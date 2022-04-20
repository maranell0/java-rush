package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        String number1;
        String number2;
        int number3, number4;


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        name = bufferedReader.readLine();
        number1 = bufferedReader.readLine();
        number2 = bufferedReader.readLine();
        number3 = Integer.parseInt(number1);
        number4 = Integer.parseInt(number2);

        System.out.println(name + " получает " + number3 +" через " + number4 + " лет.");

    }
}
