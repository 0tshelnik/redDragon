package com.javarush.test.level09.lesson08.task01;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;


/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException. Как это сделать?
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       /* HashMap<Integer, Exception> map = new HashMap<Integer, Exception>();

        map.put(0, new NullPointerException());
        map.put(1, new FileNotFoundException());
        for (Map.Entry<Integer, Exception> m : map.entrySet())
        {*/
       //     if (m.getKey() != 0 || m.getKey() != 1)
       //     {

                try
                {
                    method1();


                }
                catch (NullPointerException e)
                {
                    System.out.println("Переменная пустая");
                }
                catch (FileNotFoundException e)
                {
                    System.out.println("Файл не найден");
                }
         //       break;
       //     }
      //  }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException
    {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
