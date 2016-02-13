package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 03.12.2015.
 */
public class NewThread2 extends Thread
{

    NewThread2() {
        // Создать новый второй поток
        super("Демонстрационны поток.");
        System.out.println("Дочерний поток: " + this);
        start();
    }
    //Точка входа второго потока.
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершен.");
    }
}
