package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Скрыпак on 19.12.2015.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth() {
         return 233;
    }

    public String getDescription() {

        return  super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
