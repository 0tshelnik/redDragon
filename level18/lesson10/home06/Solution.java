package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
        HashSet<Integer> set = new HashSet<Integer>();
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        while(inputStream.available() > 0) {
            int x = inputStream.read();
            set.add(x);
        }
        inputStream.close();

        InputStream inputStream1 = new BufferedInputStream(new FileInputStream(args[0]));
        byte[] buffer = new byte[inputStream1.available()];
        while(inputStream1.available() > 0) {
            int x = inputStream1.read(buffer);
        }
        inputStream1.close();


        for (Integer i : set) {
            int x = 0;
            for (Byte j : buffer) {
                if (i == (int)j) {
                    x++;
                }
            }
            map.put(i, x);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            Integer val = entry.getValue();

                    System.out.println((char) key + " " + val);
        }
    }
}
