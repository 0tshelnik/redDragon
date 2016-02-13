package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 03.12.2015.
 */
public class DemoJoin
{
    public static void main(String[] args)
    {
        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");
        NewThread4 ob3 = new NewThread4("Three");

        System.out.println("Поток One запущен " + ob1.t.isAlive());
        System.out.println("Поток Two запущен " + ob2.t.isAlive());
        System.out.println("Поток Three запущен " + ob3.t.isAlive());
        // щжидать завершения
        try {
         System.out.println("Ожидание завершения потоков");

            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        }
        catch(InterruptedException e){
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Поток One запущен " + ob1.t.isAlive());
        System.out.println("Поток Two запущен " + ob2.t.isAlive());
        System.out.println("Поток Three запущен " + ob3.t.isAlive());

        System.out.println("Главный поток завершен.");
    }

}
