package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 10.12.2015.
 */
import java.io.*;
public class ShowFile
{
    public static void main(String[]args){
        int i;
        FileInputStream fin = null;
        // Убедиться, что имя файла указано
        if(args.length != 1) {
            System.out.println("Иcпoльзoвaниe : ShowFile имя файла");
            return;
        }

        // В следующем коде сначала открывается файл , азатем
        // из него читаются символы до тех пор , пока не встретится
        // признак конца файла
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while(i != -1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try  // Закрыть файл в любом случае
            {
                if (fin != null)
                fin.close();
            }
            catch (IOException e)
            {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
