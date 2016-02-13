package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class Caller implements Runnable
{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized(target) // синхронизированый блок
        {
            target.call(msg);
        }
    }
}
