package com.javarush.test.level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        int i = 0;

         do{
            String d = reader.readLine();

            if (!(d.equals("сумма")))
            {
                int a = Integer.parseInt(d);
                i = i + a;

             } else {
                System.out.println(i);
                break;
            }
        }while (true);
    }
}
