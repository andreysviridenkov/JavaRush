package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<String> dStrings = divide(s);
        char fS;
        for (String sS: dStrings)
        {
            fS = sS.charAt(0);
            sS = sS.substring(1);
            System.out.print(Character.toUpperCase(fS) + sS);
        }
    }

    public static ArrayList<String> divide(String s)
    {
        ArrayList<String> sA = new ArrayList<String>();

        int i = 0;

        for (int j = 0; j < s.length(); j++)
        {
            if (s.charAt(j) == ' ')
            {
              if (j>i)
              {
                sA.add(s.substring(i, j+1));
              }
                i = j+1;
            }
        }
          if (i<s.length())
          {
              sA.add(s.substring(i));
          }
        return sA;
    }

}
