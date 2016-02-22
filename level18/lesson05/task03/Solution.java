package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output1 = new FileOutputStream(file2);
        FileOutputStream output2 = new FileOutputStream(file3);

        byte[] buffer = new byte[input.available()];

        for (int i = 0; i < buffer.length; i++) {
            byte b = (byte)input.read();
            buffer[i] = b;
        }

        for (int i = 0; i < buffer.length; i++) {
            if (buffer.length % 2 == 0) {
                if (i < buffer.length / 2) {
                    output1.write(buffer[i]);
                } else {
                    output2.write(buffer[i]);
                }
            } else if (buffer.length % 2 != 0) {
                if (i < (buffer.length +1) / 2) {
                    output1.write(buffer[i]);
                } else {
                    output2.write(buffer[i]);
                }
            }
        }

        reader.close();
        input.close();
        output1.close();
        output2.close();

    }
}