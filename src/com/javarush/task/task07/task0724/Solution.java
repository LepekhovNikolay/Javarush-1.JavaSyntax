package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        boolean Men = true;
        boolean Woman = false;
        Human grandpa1 = new Human("Василий", Men, 83);
        Human grandpa2 = new Human("Анатолий", Men, 80);
        Human grandma1 = new Human("Ольга", Woman, 78);
        Human grandma2 = new Human("Наталья", Woman, 79);
        Human father = new Human("Александр Васильевич",Men, 50, grandpa1, grandma1);
        Human mother = new Human("Анастасия Анатольевна",Woman, 45, grandpa2, grandma2);
        Human child1 = new Human ("Алексей", Men, 25, father, mother);
        Human child2 = new Human ("Мария", Woman, 22, father, mother);
        Human child3 = new Human ("Гавриил", Men, 18, father, mother);



        System.out.println (grandpa1);
        System.out.println (grandpa2);
        System.out.println (grandma1);
        System.out.println (grandma2);
        System.out.println (father);
        System.out.println (mother);
        System.out.println (child1);
        System.out.println (child2);
        System.out.println (child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















