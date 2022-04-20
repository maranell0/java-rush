package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int sum = 0;
        int i = 0;

        while (true) {
            a = Integer.parseInt(rd.readLine());
            if (a != -1) {
                sum += a;
                i++;
            }
            else break;
        }
        System.out.println(sum*1.0/i);

    }
}

