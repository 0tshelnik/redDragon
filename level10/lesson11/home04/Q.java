package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class Q
{
    int n;
    boolean valueSet = false;

    synchronized int get()
    {
        while (!valueSet)
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet)
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        this.n = n;
        valueSet = true;
        System.out.println("Передано: " + n);
        notify();
    }

}
