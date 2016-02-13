package com.javarush.test.level17.lesson10.bonus01;

//import com.sun.corba.se.spi.legacy.interceptor.IORInfoExt;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
     //   allPeople.add(Person.createFemale(null, null));
    }

    public static void main(String[] args) throws IOException, ParseException
    {
        if (args.length > 0)
        {
            if (args[0].equals("-c"))
            {
                if (args.length <= 4)
                {
                    allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[5])));

                    if (args[2].equals("м")) {
                        allPeople.get(allPeople.size() - 1).setSex(Sex.MALE);
                    } else {
                        allPeople.get(allPeople.size() - 1).setSex(Sex.FEMALE);
                    }
                    System.out.println(allPeople.size() - 1);

                } else
                {
                    allPeople.add(Person.createMale(args[1] + " " + args[2], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[5])));
                    if (args[3].equals("м")) {
                        allPeople.get(allPeople.size() - 1).setSex(Sex.MALE);

                    } else {
                        allPeople.get(allPeople.size() - 1).setSex(Sex.FEMALE);

                    }
                    System.out.println(allPeople.size() - 1);
                }
            } else if (args[0].equals("-u"))
            {
                if (args.length <= 5)
                {
                    int id = Integer.valueOf(args[1]);
                    allPeople.get(id).setName(args[2]);
                    allPeople.get(id).setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[5]));

                    if (args[3].equals("м")) {
                        allPeople.get(id).setSex(Sex.MALE);
                    } else {

                        allPeople.get(id).setSex(Sex.FEMALE);
                    }
                } else
                {
                    int id = Integer.valueOf(args[1]);
                    allPeople.get(id).setName(args[2] + " " + args[3]);
                    allPeople.get(id).setBirthDay(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[5]));
                    if (args[4].equals("м")) {
                        allPeople.get(id).setSex(Sex.MALE);
                    } else {
                        allPeople.get(id).setSex(Sex.FEMALE);
                    }
                }
            } else if (args[0].equals("-d"))
            {
                int id = Integer.valueOf(args[1]);
                allPeople.get(id).setName(null);
                allPeople.get(id).setBirthDay(null);
                allPeople.get(id).setSex(null);

            } else if (args[0].equals("-i")) {
                SimpleDateFormat form = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                int id = Integer.valueOf(args[1]);
                if (allPeople.get(id).getSex() == Sex.MALE && allPeople.get(id).getBirthDay() != null )
                {
                    System.out.println(allPeople.get(id).getName() + " " + "м" + " " + form.format(allPeople.get(id).getBirthDay()));
                } else if (allPeople.get(id).getSex() == Sex.FEMALE &&  allPeople.get(id).getBirthDay() != null )
                {
                    System.out.println(allPeople.get(id).getName() + " " + "ж" + " " + form.format(allPeople.get(id).getBirthDay()));
                }
            }
        }
    }
}
