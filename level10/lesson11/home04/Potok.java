package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 03.12.2015.
 */
public class Potok
{
    public static void main(String[] args){
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток: " + t);
        t.setName("Мой Thread");
        System.out.println("После изменения имени: " + t);

        try {
            for (int i = 5; i > 0; i--)
            {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
    }
}
