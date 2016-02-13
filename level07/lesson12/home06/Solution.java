package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("Lui", true, 55, null, null);
        Human grandFather2 = new Human("Djon", true, 70, null, null);

        Human grandMother1 = new Human("Luiza", false, 50, null, null);
        Human grandMother2 = new Human("Klava", false, 63, null, null);

        Human fathers1 = new Human("Djek", true, 32,  grandFather1,  grandMother1);
        Human mothers1 = new Human("Ludmila", false, 25,  grandFather2,  grandMother2);

        Human children1 = new Human("Dima", true, 5, fathers1, mothers1);
        Human children2 = new Human("Ania", false, 2, fathers1, mothers1);
        Human children3 = new Human("Jons", true, 8, fathers1, mothers1);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(fathers1.toString());
        System.out.println(mothers1.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

      public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
