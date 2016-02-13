package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class PCFixed

{
    public static void main(String[] args){
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
