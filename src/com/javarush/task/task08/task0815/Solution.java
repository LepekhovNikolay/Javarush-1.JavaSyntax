package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.putIfAbsent("Фамилия1","Имя1");
        map.putIfAbsent("Фамилия2","Имя2");
        map.putIfAbsent("Фамилия3","Имя3");
        map.putIfAbsent("Фамилия4","Имя4");
        map.putIfAbsent("Фамилия5","Имя5");
        map.putIfAbsent("Фамилия6","Имя6");
        map.putIfAbsent("Фамилия7","Имя7");
        map.putIfAbsent("Фамилия8","Имя10");
        map.putIfAbsent("Фамилия9","Имя10");
        map.putIfAbsent("Фамилия10","Имя10");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        final int[] count = {0};
        map.forEach( (k,v) ->
        {
            if(name.equals(v))
                count[0]++;
        }
        );
        return count[0];

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        final int[] count = {0};
        map.forEach( (k,v) ->
                {
//                    System.out.println(k + " , " + v);
                    if(lastName.equals(k))
                        count[0]++;
                }
        );
        return count[0];
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        int names = getCountTheSameFirstName(map, "Имя10");
        int lastnames = getCountTheSameLastName(map, "Фамилия1");
    }
}
