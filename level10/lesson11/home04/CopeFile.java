package com.javarush.test.level10.lesson11.home04;
import java.io.*;
/**
 * Created by Скрыпак on 10.12.2015.
 */
public class CopeFile
{
    public static void main(String[]args) throws IOException
    {
        int i;

        FileInputStream fin = null;
        FileOutputStream fout = null;

        // сначала убедиться, ято указаны имена обоих файлов
        if(args.length != 2) {
            System.out.println("Использование: CopeFile откуда куда");
            return;
        }

        // коптровать файл
        try {
            // попытаться открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1)
                    fout.write(i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Ошибка ввода-вывода");
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null)
                    fout.close();
            } catch(IOException e) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
