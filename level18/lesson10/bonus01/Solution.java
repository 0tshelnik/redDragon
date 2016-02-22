package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) {

        if (args[0].equals("-e")) {
            try
            {
                FileInputStream inputStream = new FileInputStream(args[1]);
                byte[] text = new byte[inputStream.available()];
                if (inputStream.available() > 0) { // Считываю байты из файла в массив байт
                    inputStream.read(text);
                }
                inputStream.close();

                byte[] encrypt = new byte[text.length];

                for (int i = 0; i < text.length; i++) { // Шифрую данные
                    encrypt[i] = (byte)(text[i] - (i+3));
                }

                FileOutputStream outputStream = new FileOutputStream(args[2]);
                outputStream.write(encrypt); // Записываю зашифрованне даные в файл
                outputStream.close();

            } catch(IOException e) {

            }
        } else if (args[0].equals("-d")) {
            try
            {
                FileInputStream inputStream = new FileInputStream(args[1]);
                byte[] text = new byte[inputStream.available()];
                if (inputStream.available() > 0) { // Считываю байты из файла в массив байт
                    inputStream.read(text);
                }
                inputStream.close();

                byte[] encrypt = new byte[text.length];

                for (int i = 0; i < text.length; i++) { // Дишфрую данные
                    encrypt[i] = (byte)(text[i] + (i+3));
                }

                FileOutputStream outputStream = new FileOutputStream(args[2]);
                outputStream.write(encrypt); // Записываю дишифрованые даные в файл
                outputStream.close();

            } catch(IOException e) {

            }
        }

    }
}
