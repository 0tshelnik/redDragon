package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human h1 = new Human("Fff", 11);
        Human h2 = new Human("Fff", 11, 12);
        Human h3 = new Human("Fff", 11, 25, "Dsfs");
        Human h4 = new Human("Fff", 11, "GGd", 14);
        Human h5 = new Human("Fff", "Fsgs", 25, "Djeck");
        Human h6 = new Human("Fff", 15, "Ddd");
        Human h7 = new Human("Fff", 17, "Ddd", "Sss");
        Human h8 = new Human("Fff");
        Human h9 = new Human("Fff", 17, "Ddd", "Sss", "Rrrr");
        Human h10 = new Human("Fff", 17, "Ddd", "Sss", "Rrrr", "Eeee");
    }

    public static class Human
    {
        private String name;
        private int age;
        private int sila;
        private String pets;
        private String mother;
        private String father;
        private String grendFather;
        private String grendMather;
        Human(String m){
            name = m;
        }
        Human(String m, int a){
            name = m;
            age = a;
        }
        Human(String m, int a, int b){
            name = m;
            age = a;
            sila = b;
        }
        Human(String m, int a, int b,String c){
            name = m;
            age = a;
            sila = b;
            mother = c;

        }
        Human(String m, int a, String d, int c){
            name = m;
            age = a;
            father = d;
            sila = c;

        }
        Human(String m, String g, int d, String e){
            name = m;
            grendFather = g;
            sila = d;
            pets = e;
        }
        Human(String m, int a, String mo){
            name = m;
            age = a;
            mother = mo;
        }
        Human(String m, int a, String mo, String fa){
            name = m;
            age = a;
            mother = mo;
            father = fa;
        }
        Human(String m, int a, String mo, String fa, String g){
            name = m;
            age = a;
            mother = mo;
            father = fa;
            grendMather = g;
        }

        Human(String m, int a, String mo, String fa, String g, String gf){
            name = m;
            age = a;
            mother = mo;
            father = fa;
            grendMather = g;
            grendFather = gf;
        }

    }
}
