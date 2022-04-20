package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        for (int z=0; z<5; z++){
            Zerg zerg = new Zerg();
            zerg.name = "Zerg" + z;
            //напишите тут ваш код
        }
        for (int p=0; p<3; p++){
            Protoss protoss = new Protoss();
            protoss.name = "Protoss" + p;
            //напишите тут ваш код
        }
        for (int t=0; t<4; t++){
            Terran terran = new Terran();
            terran.name = "Terran" + t;
            //напишите тут ваш код
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
