package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(123);
        set.add(1);
        set.add(13);
        set.add(435);
        set.add(45123);
        set.add(12);
        set.add(5);
        set.add(4);
        set.add(432);
        set.add(2);
        set.add(3);
        set.add(43);
        set.add(56);
        set.add(46346);
        set.add(423);
        set.add(15);
        set.add(6);
        set.add(8);
        set.add(42);
        set.add(324);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        ArrayList <Integer> list = new ArrayList<>();
        set.forEach(v -> {
            if(v>10)
                list.add(v);
        });
        set.removeAll(list);
        return set;
    }


    public static void main(String[] args) {
        HashSet<Integer> setMain = createSet();
        setMain =  removeAllNumbersMoreThan10(setMain);
    }
}
