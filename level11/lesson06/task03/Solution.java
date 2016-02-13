package com.javarush.test.level11.lesson06.task03;

/* В гостях у бабушки
Написать шесть классов: Animal (животное), Cow(корова) и Pig(свинья), Sheep(овца), Bull(бык), Goat(козел).
Унаследовать корову, свинью, овцу, быка и козла от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Animal
    {
        String feet = "four feet";
        String head = "one head";
        String tail = "one tail end of the body";
        String ears = "two ears on the sides of the head";
        String nose = "black nose";
        String body = "big body";
        String eyes = "two eyes";
    }

    public class Cow extends Animal
    {
        String voice = "мууу";
        String horns = "two horns";
    }

    public class Pig extends Animal
    {
        String voice = "хрююю";
    }

    public class Sheep extends Animal
    {
        String voice = "Беееэээ";
        String horns = "two swirling horns";
    }

    public class Bull extends Animal
    {
        String voice = "мууу";
        String horns = "two horns";
    }

    public class Goat extends Animal
    {
        String voice = "беееэээ";
        String horns = "two long horns";
    }

}
