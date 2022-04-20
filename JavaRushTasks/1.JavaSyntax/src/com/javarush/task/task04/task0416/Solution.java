package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float t= Float.parseFloat(br.readLine());
        while (t >= 5) {
            t = t-5;
        }

        if (t<3) System.out.println("зелёный");
        if (t>=3 && t<4) System.out.println("жёлтый");
        if (t>=4) System.out.println("красный");
    }
}