package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        int countProbel = 0;
        int countSimvol = 0;
        int aByte = 0;
        FileInputStream input = new FileInputStream(args[0].toString());

        while(input.available() > 0) {
            aByte = input.read();
            if (aByte == 32) {
                countProbel++;
            }
                countSimvol++;
        }
        input.close();

        double d = (double)countProbel/countSimvol*100;
        double result = Math.rint(100.0 * d)/100;
        System.out.println(result);
    }
}
