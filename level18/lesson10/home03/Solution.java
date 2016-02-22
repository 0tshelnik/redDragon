package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        String fileThree = reader.readLine();

        FileInputStream input = new FileInputStream(fileTwo);
        FileInputStream input1 = new FileInputStream(fileThree);
        FileOutputStream output = new FileOutputStream(fileOne);

        byte[] buffer = new byte[input.available()];
      if (input.available() > 0) {
          int x = input.read(buffer);
          output.write(buffer, 0, x);
      }
        input.close();
        byte[] buffer1 = new byte[input1.available()];
        if (input1.available() > 0) {
            int x = input1.read(buffer1);
            output.write(buffer1, 0, x);
        }
        reader.close();
        input1.close();
        output.close();
    }
}
