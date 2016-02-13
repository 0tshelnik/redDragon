package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написат методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(min(30, 25));
        System.out.println(min(43l, 75l));
        System.out.println(min(58.5, 23.15));
    }

    public static int min(int a, int b){
        if (a < b)
            return a;
        else
            return b;
    }
    public static long min(long a, long b) {
        if (a < b)
            return a;
        else
            return b;
    }
    public static double min(double a, double b) {
        if (a < b)
            return a;
        else
            return b;
    }

}
