package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{

    public static void main(String[] args)

    {
       /* Date year = new Date("JANUARY 1 2015");
        Date day = new Date();
        System.out.println(year);
        System.out.println(day);
        long dayTime = day.getTime() - year.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int)(dayTime/msDay);
        System.out.println(dayCount);*/

        System.out.println(isDateOdd("JANUARY 1 2015"));
    }

    public static boolean isDateOdd(String date)
    {
        Date year = new Date(date);
        Date day = new Date();

        long dayTime = day.getTime() - year.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int)(dayTime/msDay);
        if (dayCount % 2 != 0){
            return true;
        } else
        {
            return false;
        }
    }
}
