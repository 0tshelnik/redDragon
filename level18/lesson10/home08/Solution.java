package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ReadThread thread = null;

        while (true) {
            String fileName = reader.readLine();

            if (fileName.equals("exit"))
                break;

                thread = new ReadThread(fileName);
                thread.start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName = "";
        private int resultCountReiteration = 0;
        private int maxByte = 0;
        private  FileInputStream inputStream = null;
        private HashSet<Integer> set = new HashSet<Integer>();
        private int[] number;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void aByte() throws IOException {

            inputStream = new FileInputStream(fileName);


            number = new int[inputStream.available()];
            for (int i = 0; i < number.length; i++) {
                    number[i] = inputStream.read();
            }
            inputStream.close();

            for(int i : number) {
                    set.add(i);
            }
        }

        public int maxReiteration() {

            for (int i : set) {
                int count = 0;
                for (int j : number) {
                    if (i == j) {
                        count++;
                    }
                }
                if (resultCountReiteration < count) {
                    resultCountReiteration = count;
                    maxByte = i;
                }
            }

            return maxByte;
        }

        public void run()
        {

            try
            {
                aByte();
            } catch(IOException e) {

            }
            resultMap.put(fileName, maxReiteration());
        }

    }
}
