package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int j = 0;
        for (int i = 0; i < strings.size(); i++) {
            String temp = strings.get(i);
            if(temp.length() > j)
                j = temp.length();
            else{
                System.out.println(i);
                break;
            }

        }
    }
}

