package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class Consumer implements Runnable
{
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }
    public void run() {
        while(true) {
            q.get();
        }
    }
}
