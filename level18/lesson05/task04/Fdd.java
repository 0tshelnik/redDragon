package com.javarush.test.level18.lesson05.task04;

import java.io.*;

/**
 * Created by grjeh on 07.02.2016.
 */
public class Fdd
{
        public static String firstFileName;
        public static String secondFileName;
        static {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                firstFileName = reader.readLine();
                secondFileName = reader.readLine();
                reader.close();
            }
            catch (IOException e)
            {
            }
        }
        public static void main(String[] args) throws InterruptedException {
            systemOutPrintln(firstFileName);
            systemOutPrintln(secondFileName);
        }
        public static void systemOutPrintln(String fileName) throws InterruptedException {
            ReadFileInterface f = new ReadFileThread();
            f.setFileName(fileName);
            f.start();
            f.join();
            System.out.println(f.getFileContent());
        }
        public static interface ReadFileInterface {
            void setFileName(String fullFileName);
            String getFileContent();
            void join() throws InterruptedException;
            void start();
        }
        public static class ReadFileThread extends Thread implements ReadFileInterface
        {
            File file;
            String result = "";
            @Override
            public void setFileName(String fullFileName)
            {
                file = new File(fullFileName);
            }
            @Override
            public String getFileContent()
            {
                return result.trim();
            }
            @Override
            public void run()
            {
                try
                {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String h;
                    while((h = reader.readLine())!= null)
                        result = result + h +" ";
                    reader.close();
                }
                catch (IOException e)
                {
                }
            }
        }
    }

