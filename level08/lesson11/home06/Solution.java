package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(new Human("Анна", false, 17));
        children2.add(new Human("Олеся", false, 16));
        children2.add(new Human("Настя", false, 15));

        Human father = new Human("Дмитрий", true, 34);
        Human mother = new Human("Виктория", true, 33);

        /*ArrayList<Human> fathMoth = new ArrayList<Human>();
        fathMoth.add(father);
        fathMoth.add(mother);*/

        Human ded1 = new Human("Виталий", true, 67);
        Human ded2 = new Human("Виктор", true, 66);
        Human bab1 = new Human("Оксана", false, 59);
        Human bab2 = new Human("Таисия", false, 60);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(father);
        System.out.println(mother);

            System.out.println(children2.toString());


    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name, Boolean sex, int age, ArrayList<Human> children ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children  = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
