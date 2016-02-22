package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file2);

        byte[] buffer = new byte[input.available()];
        for (int i = 0; i < buffer.length; i++) {
            byte b = (byte)input.read();
            buffer[i] = b;
        }

         for (int i = buffer.length-1; i >= 0; i--) {
             byte b = buffer[i];
            output.write(b);

        }

        reader.close();
        input.close();
        output.close();
    }
}
