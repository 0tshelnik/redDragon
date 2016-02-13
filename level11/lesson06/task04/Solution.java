package com.javarush.test.level11.lesson06.task04;

/* Все мы работники
Написать четыре класса: Employee(сотрудник), Manager(управляющий), Chief(директор) и  Secretary(секретарь).
Унаследовать управляющего, директора и секретаря от сотрудника.
*/

public class Solution
{
    public class Manager extends Employee
    {
        String m = "Manager";
    }

    public class Chief extends Employee
    {
        String c = "Chief";
    }

    public class Employee
    {
        int salary = 15000;
    }

    public class Secretary extends Employee
    {
        String s = "Secretary";
    }
}
