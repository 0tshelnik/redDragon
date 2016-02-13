package com.javarush.test.level10.lesson11.home04;

import java.lang.reflect.Method;

/**
 * Created by Скрыпак on 09.12.2015.
 */
public class Meta
{
    // Аннотировать метод
    @Version(value = 18, s = "Два параметра в myMeths")
    public static void myMeths(int i, String str) {
        Meta o = new Meta();
        // получить аннотацию из метода
        // и отобразить значение членов
        try
        {
            // Для начала получить Class
            // представляющий класс
            Class<?> c = o.getClass();
            // Теперь получить объект Method,
            // представляющий этот метод
            Method m = c.getMethod("myMeths", int.class, String.class);
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

        myMeths(10, "тест");
    }
}
