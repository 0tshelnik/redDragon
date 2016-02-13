package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class Callme
{
    void call(String msg){
        System.out.print(" [" + msg);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
