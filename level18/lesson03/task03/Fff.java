package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by grjeh on 05.02.2016.
 */
public class Fff
{
    /* Самые частые байты
  Ввести с консоли имя файла
  Найти байты, которые чаше всех встречаются в файле
  Вывести их на экран через пробел.
  Закрыть поток ввода-вывода
  */
        public static void main(String[] args) throws Exception {
            Map<Integer,Integer> list = new HashMap<Integer,Integer>();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
            /*если байта нет добавляем в МАП если есть то к value этого байты добавляем 1*/
            while (fileInputStream.available()>0){
                int kay = fileInputStream.read();
                if(list.containsKey(kay)){
                    int value = list.get(kay);
                    list.put(kay, ++value);
                }
                else list.put(kay, 1);
            }
            bufferedReader.close();
            fileInputStream.close();
            /*находим байт с наибольшим повторением(value)*/
            int tempValue=0;
            for(Map.Entry<Integer, Integer> l:list.entrySet()){
                for(Map.Entry<Integer, Integer> l2:list.entrySet())
                    if(l.getValue()<l2.getValue())
                        tempValue = l2.getValue();
            }
            /*Выводим байт с наибольшим повторением, если таких байт несколько то выводим их*/
            for(Map.Entry<Integer, Integer> l:list.entrySet()){
                if(l.getValue()==tempValue)
                    System.out.print(l.getKey()+" ");
            }
        }
    }

