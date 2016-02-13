package com.javarush.test.level11.lesson06.task01;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
Унаследовать пегаса от лошади.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public class Horse {
        String feet = "four feet";
        String head = "one head";
        String tail = "one long tail end of the body";
        String ears = "two ears on the sides of the head";
        String nose = "black nose";
        String body = "big body";
    }

    public class Pegas extends Horse {
        String wings = "two wings on either side of body";
    }
}
