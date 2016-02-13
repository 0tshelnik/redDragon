package com.javarush.test.level10.lesson11.home04;

/**
 * Created by Скрыпак on 05.12.2015.
 */
import java.math.*;
public class Quiz
{
    @Version(value = 15, s = "Annotation")
    public static void ann() {

    }
    public static long longExpression(int a, int b, int c) {
        return ((100000000000L%a) >> b) | (100 / c);
    }
    public static boolean doubleExpression(double a, double b, double c) {

        return (float)(a+b) == (float)(c);
    }
    public static void main(String[] args) throws Exception {
        ann();
      System.out.println(longExpression(589, 5,9));
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
        System.out.println((float)(0.1+0.2));

    }
}
