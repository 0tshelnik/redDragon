package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
public class Sunch
{
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");
        //ожидание завершения потока
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
