package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(23.5, "Первая пара");
        labels.put(11.7, "Вторая пара");
        labels.put(17.21, "Третья пара");
        labels.put(75.4, "Четвертая пара");
        labels.put(39.41, "Пятая пара");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
