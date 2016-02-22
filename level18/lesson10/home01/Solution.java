package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int x = 0;
        FileInputStream input = new FileInputStream(args[0].toString());

        while(input.available() > 0) {
            x = input.read();
            if (x >= 97 && x <= 122) {
                count++;
            }
        }
        input.close();
        System.out.println(count);
    }
}
