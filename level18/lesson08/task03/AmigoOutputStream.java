package com.javarush.test.level18.lesson08.task03;

import java.io.*;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream
{
    public static String fileName = "d:/txx.txt";
    FileOutputStream otp;

    public AmigoOutputStream(FileOutputStream outputStream) throws FileNotFoundException
    {
        super(fileName);
        otp = outputStream;
    }

    public static void main(String[] args) throws FileNotFoundException {

        new AmigoOutputStream(new FileOutputStream(fileName));

    }

    @Override
    public void close() throws IOException {
        String s = "JavaRush © 2012-2013 All rights reserved.";
        otp.flush();
        otp.write(s.getBytes());
        otp.close();
    }
    public void flush() throws IOException {
        otp.flush();
    }
    public void write(int b) throws IOException{
        otp.write(b);
    }
    public void write(byte[] b) throws IOException{
        otp.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException{
        otp.write(b,off,len);
    }

}
