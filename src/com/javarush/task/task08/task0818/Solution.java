package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("lastname1", 1007);
        map.put("lastname2", 100);
        map.put("lastname3", 900);
        map.put("lastname4", 200);
        map.put("lastname5", 100);
        map.put("lastname6", 1020);
        map.put("lastname7", 700);
        map.put("lastname8", 500);
        map.put("lastname9", 600);
        map.put("lastname10",400);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copyMap = new HashMap<>(map);
        for (int salary: copyMap.values()) {
            if(salary<500)
                removeItemFormMapByValue(map, salary);
        }
    }

    public static void removeItemFormMapByValue(HashMap<String, Integer> map, int value){
        HashMap<String, Integer> copy = new HashMap<>(map);
        copy.forEach((k,v)->{
            if(value == v){
                map.remove(k);
            }
        });
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
   //     map.forEach((k,v) -> System.out.println(k+" " + v));
    }
}