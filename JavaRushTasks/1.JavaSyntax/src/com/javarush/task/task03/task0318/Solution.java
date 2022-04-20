package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        String years;
        int years1;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        years = bufferedReader.readLine();
        name = bufferedReader.readLine();
        years1 = Integer.parseInt(years);

      System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");

    }
}
