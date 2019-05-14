package com.javarush.task.task08.task0819;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>(3);
         Cat cat1 = new Cat();
          Cat cat2 = new Cat();
          Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat{
        public Cat() {
            }
    }
}

