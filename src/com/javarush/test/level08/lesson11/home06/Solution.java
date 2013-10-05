package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

       Human kid1 = new Human();
       kid1.age = 10;
       kid1.name = "Kid1";
       kid1.sex = true;

        Human kid2 = new Human();
        kid2.age = 11;
        kid2.name = "Kid2";
        kid2.sex = false;

        Human kid3 = new Human();
        kid3.age = 12;
        kid3.name = "Kid3";
        kid3.sex = true;

        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 27;
        mother.children.add(kid1);
        mother.children.add(kid2);
        mother.children.add(kid3);

        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 28;
        father.children.add(0, kid1);
        father.children.add(1, kid2);
        father.children.add(2, kid3);

        Human oldmother = new Human();
        oldmother.name = "oldmother";
        oldmother.sex = false;
        oldmother.age = 48;
        oldmother.children.add(0, mother);

        Human oldfather = new Human();
        oldfather.name = "oldfather";
        oldfather.sex = true;
        oldfather.age = 47;
        oldfather.children.add(0, mother);

        Human oldmother2 = new Human();
        oldmother2.name = "oldmother2";
        oldmother2.sex = false;
        oldmother2.age = 44;
        oldmother2.children.add(0, father);

        Human oldfather2 = new Human();
        oldfather2.name = "oldfather2";
        oldfather2.sex = true;
        oldfather2.age = 45;
        oldfather2.children.add(0, father);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(oldmother);
        System.out.println(oldfather);
        System.out.println(oldmother2);
        System.out.println(oldfather2);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
