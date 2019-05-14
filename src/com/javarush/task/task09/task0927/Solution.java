package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Cat cat1 = new Cat("nameOfCat1");
        Cat cat2 = new Cat("nameOfCat2");
        Cat cat3 = new Cat("nameOfCat3");
        Cat cat4 = new Cat("nameOfCat4");
        Cat cat5 = new Cat("nameOfCat5");
        Cat cat6 = new Cat("nameOfCat6");
        Cat cat7 = new Cat("nameOfCat7");
        Cat cat8 = new Cat("nameOfCat8");
        Cat cat9 = new Cat("nameOfCat9");
        Cat cat10 = new Cat("nameOfCat10");
        Map<String, Cat> map = new HashMap<>(10);
        map.put(cat1.getName(), cat1);
        map.put(cat2.getName(), cat2);
        map.put(cat3.getName(), cat3);
        map.put(cat4.getName(), cat4);
        map.put(cat5.getName(), cat5);
        map.put(cat6.getName(), cat6);
        map.put(cat7.getName(), cat7);
        map.put(cat8.getName(), cat8);
        map.put(cat9.getName(), cat9);
        map.put(cat10.getName(), cat10);
        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>(10);
        map.forEach((k,v) -> cats.add(v));
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
