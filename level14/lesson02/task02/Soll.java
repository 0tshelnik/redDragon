package com.javarush.test.level14.lesson02.task02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Скрыпак on 19.12.2015.
 */
public class Soll
{
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
    map.put("IHOR","JUNE 1 1980");
    map.put("Vova", "JULY");
    map.put("Крилоне", "Mihail");
    map.put("Феллоне", "MAY 4 1983");
    map.put("Куллоне", "APRIL 5 1984");
    map.put("Саллоне", "Mihail");
    map.put("Сталоне", "OCTOBER 7 1986");
    map.put("Сталлне", "MARCH 8 1987");
    map.put("Сталлое", "JANUARY 9 1988");
    map.put("Сталлон", "FEBRUARY 10 1989");
    return map;

}
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy1 = new HashMap<String, String>(map);
    //    int i = 0;
        for(Map.Entry<String, String> pair : copy1.entrySet())
        {
            int i = 0;
            for (Map.Entry<String, String> pai : copy1.entrySet())

            if (pair.getValue().contains(pai.getValue()))
            {
                i++;


                if (i > 1)
                {
                    System.out.println(i);
                    removeItemFromMapByValue(map, pai.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().contains(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String []args) {

        HashMap<String, String> q= createMap();
        for (Map.Entry<String, String> map : createMap().entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue());
        }
        System.out.println(" ");
        removeTheFirstNameDuplicates(q);
        for (Map.Entry<String, String> map : createMap().entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue());
        }

    }
}
