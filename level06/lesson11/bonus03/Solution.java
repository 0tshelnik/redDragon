package com.javarush.test.level06.lesson11.bonus03;

import java.io.*;

/* &#x417;&#x430;&#x434;&#x430;&#x447;&#x430; &#x43f;&#x43e; &#x430;&#x43b;&#x433;&#x43e;&#x440;&#x438;&#x442;&#x43c;&#x430;&#x43c;
&#x417;&#x430;&#x434;&#x430;&#x447;&#x430;: &#x41d;&#x430;&#x43f;&#x438;&#x441;&#x430;&#x442;&#x44c; &#x43f;&#x440;&#x43e;&#x433;&#x440;&#x430;&#x43c;&#x43c;&#x443;, &#x43a;&#x43e;&#x442;&#x43e;&#x440;&#x430;&#x44f; &#x432;&#x432;&#x43e;&#x434;&#x438;&#x442; &#x441; &#x43a;&#x43b;&#x430;&#x432;&#x438;&#x430;&#x442;&#x443;&#x440;&#x44b; 5 &#x447;&#x438;&#x441;&#x435;&#x43b; &#x438; &#x432;&#x44b;&#x432;&#x43e;&#x434;&#x438;&#x442; &#x438;&#x445; &#x432; &#x432;&#x43e;&#x437;&#x440;&#x430;&#x441;&#x442;&#x430;&#x44e;&#x449;&#x435;&#x43c; &#x43f;&#x43e;&#x440;&#x44f;&#x434;&#x43a;&#x435;.
&#x41f;&#x440;&#x438;&#x43c;&#x435;&#x440; &#x432;&#x432;&#x43e;&#x434;&#x430;:
3
2
15
6
17
&#x41f;&#x440;&#x438;&#x43c;&#x435;&#x440; &#x432;&#x44b;&#x432;&#x43e;&#x434;&#x430;:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a[] = new int[5];
        int min;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < a.length; i++)
        {
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 1; i < a.length; i++){
            for (int j = a.length-1; j >= i; j--)
            {
                if (a[j-1] > a[j])
                {   int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;

                }

            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

}
