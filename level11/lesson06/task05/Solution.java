package com.javarush.test.level11.lesson06.task05;

/* ИТ-компания
Написать девять классов: Worker(сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer(программист), ProjectManager(менеджер проекта), CTO(технический директор), HR(рекрутер), OfficeManager(офис-менеджер), Cleaner (уборщик).
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Worker
    {
        String worker = "worker on IT company";
    }

    public class Clerk extends Worker
    {
        String cl = "Офисный персонал";
    }

    public class IT extends Worker
    {
        String it = "personnel software development";
    }

    public class Programmer extends IT
    {
        String work = "software development";
    }

    public class ProjectManager extends IT
    {
        String m = "Занимается продвижением проэкта";
    }

    public class CTO extends IT
    {
        String c = "Ответственный за обслуживание оборудования";
    }

    public class OfficeManager extends Clerk
    {
        String o = "Работает в офисе";
    }

    public class HR extends Clerk
    {
        String e = "Ищет новых сотрудников";
    }

    public class Cleaner extends Clerk
    {
        String c = "Уборщик";
    }
}
