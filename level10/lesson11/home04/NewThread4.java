package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 03.12.2015.
 */
public class NewThread4 implements Runnable
{
    String name;
    Thread t;

    NewThread4(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        t.start();
    }
    public void run() {
        try
        {
            for (int i = 5; i > 0; i--)
            {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}
