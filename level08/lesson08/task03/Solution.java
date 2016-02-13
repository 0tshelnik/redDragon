package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "t");
        map.put("k", "w");
        map.put("w", "e");
        map.put("r", "t");
        map.put("t", "u");
        map.put("y", "i");
        map.put("o", "p");
        map.put("s", "d");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, String> ma = iter.next();
            String c = ma.getValue();
            if (c.equals(name)){
                i++;
            }
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, String> ma = iter.next();
            String c = ma.getKey();
            if (c.equals(familiya)){
                i++;
            }

        }
        return i;
    }

}
