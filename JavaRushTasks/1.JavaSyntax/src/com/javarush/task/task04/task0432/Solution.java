package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String a = br.readLine();
       int b = Integer.parseInt(br.readLine());
       while (b>0) {
           System.out.println(a);
           b--;
       }
       //напишите тут ваш код

    }
}
