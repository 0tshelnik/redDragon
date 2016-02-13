package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Скрыпак on 19.12.2015.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth() {

        return 150;
    }

    public String getDescription() {

        return  super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
