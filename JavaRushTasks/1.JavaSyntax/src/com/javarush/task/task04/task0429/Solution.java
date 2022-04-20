package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int p = 0, n = 0;
        if (a > 0) p++;
                else {
                    if (a < 0) n++;
        }
        if (b > 0) p++;
            else {
                if (b < 0) n++;
        }
        if (c > 0) p++;
            else {
                if (c < 0) n++;
        }
        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + p);

    }
}
