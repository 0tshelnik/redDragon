package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Скрыпак on 02.01.2016.
 */
public class Plane implements Flyable {

    public int passenger;

    public void fly() {
        System.out.println("Пассажирский самолет");
    }

    public Plane(int i) {

        passenger = i;
    }
}
