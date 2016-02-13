package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static  ArrayList<int[]> createList()
    {
        ArrayList<int[]> list  = new ArrayList<int[]>();

        list.add(new int[] {1, 3, 7, 9, 11});
        list.add(new int[] {15, 74});
        list.add(new int[] {88, 32, 98, 11});
        list.add(new int[] {6, 22, 12, 31, 2, 0, 27});
        list.add(new int[] {});

        return list;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
