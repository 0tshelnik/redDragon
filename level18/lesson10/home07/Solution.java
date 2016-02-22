package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {
        int i = 0;
        String s= "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputStream = new BufferedReader(new FileReader(reader.readLine()));
        HashMap<String, String> map = new HashMap<>();

        while((i = inputStream.read()) > -1) {

            for (int j = 0; ; j++) {
                if (i == 32)
                    break;
                s += (char) i;
                i = inputStream.read();
            }
            map.put(s, inputStream.readLine());
            s = "";
        }
        reader.close();
        inputStream.close();

        for (Map.Entry<String, String> m : map.entrySet()) {
            if (args[0].equals(m.getKey()))
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
