package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() < min)
                min = strings.get(i).length();
            else if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() == min || strings.get(i).length() == max){
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
