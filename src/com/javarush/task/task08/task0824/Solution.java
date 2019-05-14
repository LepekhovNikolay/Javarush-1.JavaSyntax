package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/
import java.util.ArrayList;

public class Solution {
    static boolean man = true, woman = false;
    public static void main(String[] args) {
        Human child1 = new Human("Леонид", man, 7);
        Human child2 = new Human("Алеся", woman, 10);
        Human child3 = new Human("Марк", man, 4);
        ArrayList<Human> grandchildren = new ArrayList<>(3);
        grandchildren.add(child1);
        grandchildren.add(child2);
        grandchildren.add(child3);
        Human mother = new Human("Маша", woman, 35, grandchildren);
        ArrayList<Human> motheralsochild = new ArrayList<>(1);
        motheralsochild.add(mother);
        Human father = new Human("Коля", man, 40, grandchildren);
        ArrayList<Human> fatheralsochild = new ArrayList<>(1);
        fatheralsochild.add(father);
        Human fathergrandpa = new Human("Виктор", man, 70, fatheralsochild);
        Human fathergrandma = new Human("Лариса", woman, 70, fatheralsochild);
        Human mothergrandpa = new Human("Александр", man, 68, motheralsochild);
        Human mothergrandma = new Human("Алена", woman, 65, motheralsochild);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(fathergrandma);
        System.out.println(fathergrandpa);
        System.out.println(mothergrandma);
        System.out.println(mothergrandpa);
    }

    public static class Human {
         String name;
         boolean sex;
         int age;
         ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            for (int i = 0; i < children.size(); i++) {
                this.children.add(children.get(i));
            }
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
