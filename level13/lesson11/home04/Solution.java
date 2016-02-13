package com.javarush.test.level13.lesson11.home04;
import java.io.*;
import java.util.ArrayList;
/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        String s;

        ArrayList<String> array = new ArrayList<String>();

        FileWriter str = new FileWriter(file);

        while(true) {
            s = reader.readLine();

            array.add(s);
            if (s.equals("exit"))
                break;
        }

        for (int i = 0; i < array.size(); i++) {

            str.write(array.get(i) + "\r\n");
        }

        str.close();

    }
}
