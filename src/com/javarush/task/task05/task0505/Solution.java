package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Storm", 8, 12, 4);
        Cat cat2 = new Cat ("Nimitz", 10, 11, 5);
        Cat cat3 = new Cat ("Tron", 4, 13, 3);
        if (cat1.fight(cat2))
            System.out.println(cat1.name + " выиграл у " + cat2.name);
        else
            System.out.println(cat2.name + " выиграл у " + cat1.name);
        if (cat1.fight(cat3))
            System.out.println(cat1.name + " выиграл у " + cat3.name);
        else
            System.out.println(cat3.name + " выиграл у " + cat1.name);
        if (cat2.fight(cat3))
            System.out.println(cat2.name + " выиграл у " + cat3.name);
        else
            System.out.println(cat3.name + " выиграл у " + cat2.name);

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
