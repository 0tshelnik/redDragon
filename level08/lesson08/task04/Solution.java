package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Shvarc", new Date("SEPTEMBER 30 2004"));
        map.put("Dorn", new Date("FEBRUARY 10 1895"));
        map.put("Stey", new Date("MARCH 25 1992"));
        map.put("Francisko", new Date("APRIL 17 1889"));
        map.put("Djoli", new Date("MAY 11 2001"));
        map.put("Grey", new Date("JANUARY 1 1999"));
        map.put("Skrypak", new Date("DECEMBER 19 1878"));
        map.put("Holli", new Date("NOVEMBER 8 1995"));
        map.put("Stethem", new Date("OCTOBER 12 1875"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Date> m = iter.next();
            Date s = m.getValue();
            if (s.getMonth() == 5  || s.getMonth() == 6 || s.getMonth() == 7){
                iter.remove();
            }
        }


    }

}
