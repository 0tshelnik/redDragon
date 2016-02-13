package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class Producer implements Runnable
{
    Q q;
    Thread t;
    public Producer (Q q) {
        this.q = q;
        t = new Thread(this, "Поставщик");
        t.start();
    }
    public void run() {
        int i = 0;
        while(true)
        {
            q.put(i++);
        }
    }

}
