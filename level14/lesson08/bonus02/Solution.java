package com.javarush.test.level14.lesson08.bonus02;
import java.io.*;
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());

        while(true) {
            int b;
            if (i > j)
            {
                int a = i % j;
                if (a == 0)
                {
                    System.out.println(j);
                    break;

                } else if (a != 0) {
                    b = a;
                    a = j % a;
                    j = b;
                }

            } else if (j > i) {

                int a = j % i;

                if (a == 0)
                {
                    System.out.println(i);
                    break;

                } else if (a != 0) {
                    b = a;
                    a = i % a;
                    i = b;
                }
            }
        /*    int a;
            if (i <= 0 || j <= 0)
                break;
            if (i > j)
            {
                i = i % j;
                a = i;
            } else
                j = j % i;
            a = j;
            System.out.println(a);*/
        }
    }
}
