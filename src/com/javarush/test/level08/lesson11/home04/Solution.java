package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        boolean wasChange = true;
                                  int cs;
        while (wasChange == true)
        { wasChange = false;

            for (int i = 0; i < array.size()-1; i++)
            {
                if (array.get(i) > array.get(i+1))
                {
                    wasChange = true;
                    cs = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1, cs);
                }
            }
        }


        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> integerList = new ArrayList<Integer>();

        int n = Integer.parseInt(reader.readLine());

        for (int s = 0; s< n; s++)
            integerList.add(Integer.parseInt(reader.readLine()));

        return integerList;
    }
}
