package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();

        reader.close();

        FileInputStream inputStream = new FileInputStream(fileOne);
        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0) {
            inputStream.read(buffer);
        }
        inputStream.close();

        FileInputStream inputStream1 = new FileInputStream(fileTwo);
        FileOutputStream outputStream = new FileOutputStream(fileOne);

        while (inputStream1.available() > 0) {
            outputStream.write(inputStream1.read());
        }
        inputStream1.close();

        outputStream.write(buffer);
        outputStream.close();
    }
}
