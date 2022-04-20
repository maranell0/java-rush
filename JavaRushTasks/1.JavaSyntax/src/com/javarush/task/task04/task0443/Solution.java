package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        System.out.println("Меня зовут " + name + "." + "\n" + "Я родился " + d + "." + m + "." + y);

    }
}
