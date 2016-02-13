package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 03.12.2015.
 */
public class ExtendsThread
{
    public static void main(String[] args) {
        new NewThread2();
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
