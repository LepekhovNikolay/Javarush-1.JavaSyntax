package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxSize = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (maxSize < strings.get(i).length())
                maxSize = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxSize)
                System.out.println(strings.get(i));
        }
    }
}
