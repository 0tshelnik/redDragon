package com.javarush.test.level13.lesson11.home03;

import java.io.*;
/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        int data;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream input = new FileInputStream(reader.readLine());

       while(input.available() > 0){

           data = input.read();
               System.out.print((char)data);
       }

        input.close();
    }
}
