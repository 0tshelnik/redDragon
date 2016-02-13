package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 03.12.2015.
 */
public class MultiThreadDemo
{
    public static void main(String[] args){
        new NewThread3("ПЕРВЫЙ"); // Запуск потоков
        new NewThread3("ВТОРОЙ");
        new NewThread3("ТРЕТИЙ");

        try {
           // Ожидание завершение других потоков
            Thread.sleep(10000);

            }
            catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }
        System.out.println("Главный поток завершен");
    }
}
