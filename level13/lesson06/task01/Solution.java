package com.javarush.test.level13.lesson06.task01;

/* Dog, Cat и Mouse
1. Создать классы Dog, Cat и Mouse.
2. Реализовать интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.
*/

public class Solution
{

    public interface Moveable //может двигаться
    {
        void move();
    }

    public interface Eatable  //может быть съеден
    {
        void eaten();
    }

    public interface Eat  //может кого-нибудь съесть
    {
        void eat();
    }

    class Dog implements Moveable, Eat{
        public void move() {
            System.out.println("Гонится за котом");
        }

        public void eat() {
            System.out.println("Может съесть кота");
        }
    }

    class Cat implements Moveable, Eat, Eatable {
        public void move() {
            System.out.println("Гонится за мышей");
        }

        public void eat() {
            System.out.println("Cъест мышу если догонит");
        }

        public void eaten() {
            System.out.println("Если собака догонит, то съест");
        }
    }

    class Mouse implements Moveable, Eatable {
        public void move() {
            System.out.println("Убегает от кота");
        }

        public void eaten() {
            System.out.println("Если кот догонит, то съест");
        }
    }
}
