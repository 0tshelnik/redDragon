package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        map.put("y", "t");
        map.put("o", "p");
        map.put("s", "d");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
            HashMap<String, String> ma = new HashMap<String, String>(map);

        for (Map.Entry<String, String> n : ma.entrySet()){
             int i = 0;
             String val = n.getValue();
            for (Map.Entry<String, String> m : ma.entrySet()){
                String val1 = m.getValue();
                if (val.equals(val1)){
                    i++;
                }
            }
            if (i > 1){
                removeItemFromMapByValue(map, val);
            }
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args){
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for(Map.Entry<String, String> k : map.entrySet()){
            System.out.println(k);
        }
    }
}
