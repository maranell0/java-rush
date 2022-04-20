package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        if (a >= b && a >= c && a >= d) System.out.println(a);
        else {
            if (b >= a && b >= c && b >= d) System.out.println(b);
            else {
                if (c >= a && c >= b && c >= d) System.out.println(c);
                else {
                    System.out.println(d);
                }
            }
        }
    }
}
