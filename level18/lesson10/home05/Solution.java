package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();


        Scanner scan = new Scanner(new File(fileOne));
        FileWriter outputStream = new FileWriter(fileTwo);


        while (scan.hasNextDouble()) {
            int d = (int) Math.round(scan.nextDouble());
            outputStream.write(String.valueOf(d) + " ");
        }
            scan.close();
            outputStream.close();
            reader.close();

    }
}
