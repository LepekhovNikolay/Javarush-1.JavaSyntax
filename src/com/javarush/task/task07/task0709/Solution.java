package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() < minSize)
                minSize = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minSize)
                System.out.println(strings.get(i));
        }
    }
}
