package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int positive = 0, negative = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if (a[i] > 0)
                positive++;
            else if (a[i] < 0)
                negative++;
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
