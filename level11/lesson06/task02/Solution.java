package com.javarush.test.level11.lesson06.task02;

/* Домашние животные
Написать три класса: Pet (домашнее животное), Cat(кот) и Dog(собака).
Унаследовать кота и собаку от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public class Pet
    {
        String feet = "four feet";
        String head = "one head";
        String tail = "one long tail end of the body";
        String ears = "two ears on the sides of the head";
        String nose = "black nose";
        String body = "big body";
        String eyes = "two eyes";

    }

    public class Cat extends Pet
    {
        String voice = "мяу-мяу-мяу";
    }

    public class Dog extends Pet
    {
        String voice = "Гав-гав-гав";
    }
}
