package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int z;
        if (a < b) {
            z = b;
            b = a;
            a = z;
        }
        if (b < c) {
            z = c;
            c = b;
            b = z;
        }
        if (a < b) {
            z = b;
            b = a;
            a = z;
        }
        System.out.println(a + " " + b + " " + c);

    }
}
