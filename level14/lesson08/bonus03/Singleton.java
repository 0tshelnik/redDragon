package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Скрыпак on 23.12.2015.
 */

public class Singleton {

    private static Singleton s = null;

    private Singleton() {
        System.out.println("Singleton");
    }

    public final static Singleton getInstance() {
        if (s == null)
        s = new Singleton();
        return s;
    }
}
