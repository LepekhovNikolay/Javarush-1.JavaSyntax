package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private float hightInMeters;
        private String education;
        private Human mother;
        //№1
        public Human(Human human){//ввод двойника
            this.name = human.name;
            this.age = human.age;
            this.sex = human.sex;
            this.hightInMeters = human.hightInMeters;
            this.education = human.education;
            this.mother = human.mother;

        }
        //№2
        public Human(String name, int age, boolean sex, float hightInMeters, String education, Human mother) {//все известно
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hightInMeters = hightInMeters;
            this.education = education;
            this.mother = mother;
        }
        //№3
        public Human(String name, int age, boolean sex, float hightInMeters, String education) {//Мама не известна
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hightInMeters = hightInMeters;
            this.education = education;
        }
        //№4
        public Human(String name, int age, boolean sex, float hightInMeters, Human mother) {//образование не известно
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hightInMeters = hightInMeters;
            this.mother = mother;
        }
        //№5
        public Human(String name, float hightInMeters, String education, Human mother) {//Женщин спрашивать о возрасте не стоит:)
            this.name = name;
            this.sex = true;// тру ис вуман
            this.hightInMeters = hightInMeters;
            this.education = education;
            this.mother = mother;
        }//№6
        public Human(String name, int age, boolean sex, float hightInMeters) {//не всегда стоит при первой встрече спрашивать образование и маму
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hightInMeters = hightInMeters;
        }
        //№7
        public Human(Human human, boolean sex){//ввод двойника но возраст может отличаться
            this.name = human.name;
            this.age = human.age;
            this.sex = sex;
            this.hightInMeters = human.hightInMeters;
            this.education = human.education;
            this.mother = human.mother;
        }
        //№8
        public Human( int age, boolean sex, float hightInMeters, String education, Human mother) {//имя человек скрывает под псевдонимом
            this.name = "Вася";
            this.age = age;
            this.sex = sex;
            this.hightInMeters = hightInMeters;
            this.education = education;
            this.mother = mother;
        }
        //№9
        public Human(String name, int age, boolean sex, String education, Human mother) {//а вдруг у человека комплексы по поводу роста:)
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.education = education;
            this.mother = mother;
        }
        //№10
        public Human(String name, String education) {//Известно только имя и образование - прием на собеседование
            this.name = name;
            this.education = education;
        }
    }
}
