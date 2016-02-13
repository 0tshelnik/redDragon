package com.javarush.test.level10.lesson11.home04;

import java.lang.reflect.Method;

/**
 * Created by Скрыпак on 09.12.2015.
 */
public class MyM
{
    // Аннотировать метод
    @Version(value = 15, s = "Annotation")
    public static void myMeth() {
        MyM o = new MyM();
        // получить аннотацию из метода
        // и отобразить значение членов
        try
        {
            // Для начала получить Class
            // представляющий класс
            Class<?> c = o.getClass();
            // Теперь получить объект Method,
            // представляющий этот метод
            Method m = c.getMethod("myMeth");
            // Далее получить аннотацию класса
            Version v = m.getAnnotation(Version.class);
            // Отобразить аннотацию
            System.out.println(v.value() + " " + v.s());
        }
        catch (NoSuchMethodException e)
        {
            System.out.println("Метод не найден");
        }
    }
    public static void main(String[]args) {
        myMeth();
    }

}
