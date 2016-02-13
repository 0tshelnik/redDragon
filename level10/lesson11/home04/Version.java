package com.javarush.test.level10.lesson11.home04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Скрыпак on 09.12.2015.
 */
//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Version
{
    int value();
    String s();
}
