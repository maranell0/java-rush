package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 999 || a < 1) {

        }
        else {
            if (a % 2 == 0 && a < 10 && a >= 1) System.out.println("четное однозначное число");
            if (a % 2 != 0 && a < 10 && a >= 1) System.out.println("нечетное однозначное число");
            if (a % 2 == 0 && a < 100 && a >= 10) System.out.println("четное двузначное число");
            if (a % 2 != 0 && a < 100 && a >= 10) System.out.println("нечетное двузначное число");
            if (a % 2 == 0 && a < 1000 && a >= 100) System.out.println("четное трехзначное число");
            if (a % 2 != 0 && a < 1000 && a >= 100) System.out.println("нечетное трехзначное число");
        }
    }
}
