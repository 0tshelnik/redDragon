package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;

        int in[] = new int[5];

        for (int i = 0; i < 5; i++) {
            in[i] = a = Integer.parseInt(reader.readLine());
        }

        int minimum = min(in);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] a) {
        int q = a[0];
        for(int i = 0; i < a.length; i++) {
            q = a[i];
            int im = i;
            for(int j = i+1; j < a.length; j++) {

                if (q < a[j]) {
                    q = a[j];
                    im = j;
                }
            }
            if (i != im) {
                int temp = a[i];
                a[i] = a[im];
                a[im] = temp;
            }
        }
        return q;
    }

}
