package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            int temp = Integer.parseInt(reader.readLine());
            numbers[i] = temp;
            if (temp>maximum)
                maximum = temp;
            if (temp< minimum)
                minimum = temp;
        }

        System.out.print(maximum + " " + minimum);
    }
}
