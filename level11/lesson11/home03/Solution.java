package com.javarush.test.level11.lesson11.home03;

/* Эволюция
Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human (Человек).
Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Fish
    {
        String life = "Живут";
    }

    public class Animal extends Fish
    {
        String s = "Дышат";
    }

    public class Ape extends Animal
    {
        String feet = "Бегают на двух ногах";
    }

    public class Human extends Ape
    {
        String tell = "Умеют говорить";
    }

}
