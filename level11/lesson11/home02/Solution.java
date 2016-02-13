package com.javarush.test.level11.lesson11.home02;

/* AppleIPhone и SamsungGalaxyS2
Написать два класса AppleIPhone и SamsungGalaxyS2.
Унаследовать SamsungGalaxyS2 от AppleIPhone.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public  class AppleIPhone
    {
        String touchScrin = "Имеет сенсорныый яркий дисплей";
        String funkcional = "Поддерживает все программы";
        String camera = "Имеет хорошую камеру";
        String battery = "Аккумулятор держит не долго";
        private String key = "В низу панели имеется клавиша меню";
        private String sign = "С задней стороны имеет эмблему я блока";
    }

    public class SamsungGalaxyS2 extends AppleIPhone
    {
        String key = "Внизу панели имеет прямоугольную клавишу houm";

    }
}
