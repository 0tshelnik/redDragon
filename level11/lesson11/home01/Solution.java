package com.javarush.test.level11.lesson11.home01;

/* Адам и Ева
Написать два класса Adam(Адам) и Eve(Ева).
Унаследовать Еву от Адама.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    //Адам
    public class Adam
    {
        String heand = "two heands";
        String feet = "two feet";
        String head = "one head";
        String hair = "black hair";
    }

    //Ева
    public class Eve extends Adam
    {
        String lHair = "long hair";
        String pizda = "hava pizdu";
    }
}
