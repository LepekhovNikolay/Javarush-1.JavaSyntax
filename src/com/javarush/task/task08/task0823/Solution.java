package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] charString = new char[s.length()];
        charString = s.toCharArray();
        boolean flag = true;
        for (int i = 0; i < charString.length; i++) {
            if(flag && Character.isLetter(charString[i])) {//выполняем, если только выставлен флаг
                flag = false;
                charString[i] = Character.toUpperCase(charString[i]);

            }
            if(charString[i] == ' ')
                flag = true;
        }

        for (int i = 0; i < charString.length; i++) {
            System.out.print(charString[i]);
        }
    }
}
