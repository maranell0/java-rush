package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
       int sum = 0;
       while (true) {
           int number = Integer.parseInt(br.readLine());
           sum += number;
           if (number == -1) {
               System.out.println(sum);
               break;
           }
       }
    }
}
