package com.javarush.test.level08.lesson11.home09;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.print(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        HashMap<String, Integer> months = newMap();

        //System.out.println(months);

        ArrayList<String> sA = divide(date);

        //System.out.println(sA);

        Calendar calendar = GregorianCalendar.getInstance();
        //System.out.println(months.get(sA.get(0)));
        calendar.set(Calendar.MONTH, months.get(sA.get(0)));
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(sA.get(1)));
        calendar.set(Calendar.YEAR, Integer.parseInt(sA.get(2)));

        //System.out.println(calendar);

        int doy = calendar.get(calendar.DAY_OF_YEAR);

        //System.out.println(doy);

        return doy%2 != 0;
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
                    sA.add(s.substring(i, j));
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

    public static HashMap<String, Integer> newMap()
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("January",Calendar.JANUARY);
        map.put("February",Calendar.FEBRUARY);
        map.put("March",Calendar.MARCH);
        map.put("April",Calendar.APRIL);
        map.put("May",Calendar.MAY);
        map.put("June",Calendar.JUNE);
        map.put("July",Calendar.JULY);
        map.put("August",Calendar.AUGUST);
        map.put("September",Calendar.SEPTEMBER);
        map.put("October",Calendar.OCTOBER);
        map.put("November",Calendar.NOVEMBER);
        map.put("December",Calendar.DECEMBER);

        map.put("JANUARY",Calendar.JANUARY);
        map.put("FEBRUARY",Calendar.FEBRUARY);
        map.put("MARCH",Calendar.MARCH);
        map.put("APRIL",Calendar.APRIL);
        map.put("MAY",Calendar.MAY);
        map.put("JUNE",Calendar.JUNE);
        map.put("JULY",Calendar.JULY);
        map.put("AUGUST",Calendar.AUGUST);
        map.put("SEPTEMBER",Calendar.SEPTEMBER);
        map.put("OCTOBER",Calendar.OCTOBER);
        map.put("NOVEMBER",Calendar.NOVEMBER);
        map.put("DECEMBER",Calendar.DECEMBER);

        return map;
    }
}
