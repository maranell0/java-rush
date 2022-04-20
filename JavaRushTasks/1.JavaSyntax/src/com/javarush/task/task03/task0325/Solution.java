package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String zp;
        int zp1;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        zp = bufferedReader.readLine();
        zp1 = Integer.parseInt(zp);
        System.out.println("Я буду зарабатывать $" + zp1 + " в час");
    }
}
