package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> people = new HashMap<>(10);
        people.put("Анисимов", "Юрий");
        people.put("Берещенко", "Юрий");
        people.put("Волгодонский", "Павел");
        people.put("Геращенко", "Антон");
        people.put("Дзюба", "Роман");
        people.put("Емельяненко", "Василий");
        people.put("Жильцова", "Дарья");
        people.put("Якимов", "Илья");
        people.put("Гребнев", "Илья");
        people.put("Емельяненко", "Петр");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
