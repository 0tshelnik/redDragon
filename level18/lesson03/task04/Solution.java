package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int coincide = 0;

        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        List<Integer> allByte = new ArrayList<Integer>();
        HashSet<Integer> hash;
        List<Integer> highestReps = new ArrayList<Integer>();

        while (stream.available() > 0)
        {
            int x = stream.read();
            allByte.add(x);
        }
        stream.close();
        hash = new HashSet<Integer>(allByte);

        for (Integer i : hash)
        {
            int count = 0;
            for (Integer j : allByte)
            {
                if (i == j)
                {
                    count++;
                }
            }
            if (count >= coincide && count > 1)
            {
                coincide = count;
            }
        }

        for (Integer i : hash)
        {
            int count = 0;
            for (Integer j : allByte)
            {
                if (i == j)
                {
                    count++;
                }
            }
            if (count < coincide)
            {
                coincide = count;
            }
        }

        for (Integer i : hash)
        {
            int count = 0;
            for (Integer j : allByte)
            {
                if (i == j)
                {
                    count++;
                }
            }
            if (count == coincide)
            {
              //  highestReps.add(i);
                System.out.print(i + " ");
            }
        }
    }
}
