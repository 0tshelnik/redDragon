package com.javarush.test.level13.lesson11.bonus01;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        int i;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner str = new Scanner(new FileInputStream(reader.readLine()));

        ArrayList<Integer> array = new ArrayList<Integer>();


        while(str.hasNextInt()) {

            i = str.nextInt();
            array.add(i);

        }

        str.close();

        for (int j = 0; j < array.size(); j++) {
            int ai = array.get(j);
            int imin = j;
            for (int n = j+1; n < array.size(); n++){
                if (ai > array.get(n)) {
                    ai = array.get(n);
                    imin = n;
                }
          }
            if (j != imin) {
                int temp = array.get(j);
                array.set(j, array.get(imin));
                array.set(imin, temp);
            }
        }

        for (int n = 0; n < array.size(); n++)
        {
             if (array.get(n) % 2 == 0 && array.get(n) != 0)
            System.out.println(array.get(n));
        }

    }
}
