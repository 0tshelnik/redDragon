package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++){
            set.add(i);
        }
        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        Iterator<Integer> ss = set.iterator();
        while (ss.hasNext()){

            Integer a = ss.next();
            if (a > 10)
            {
                ss.remove();
            }
        }

        return set;
    }
}
