package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int max = 0;
        FileInputStream stream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        while(stream.available() > 0) {

            int byt = stream.read();
             if (byt > max) {
                 max = byt;
             }
        }
        stream.close();
        System.out.println(max);
    }
}
