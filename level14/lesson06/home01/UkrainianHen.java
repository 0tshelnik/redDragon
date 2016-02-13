package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Скрыпак on 19.12.2015.
 */
public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth() {
        return 410;
    }

    public String getDescription() {

        return  super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
