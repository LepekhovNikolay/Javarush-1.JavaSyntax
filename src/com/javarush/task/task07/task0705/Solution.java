package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sizeBig = 20, sizeHalf = sizeBig/2;
        int[] big = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());
        }
        int[] half1 = new int[10];
        int[] half2 = new int[10];
        for (int i = 0; i < sizeHalf; i++) {
            half1[i] = big[i];
        }
        for (int i = 0; i < sizeHalf; i++) {
            half2[i] = big[i+sizeHalf];
        }
        for (int i = 0; i < sizeHalf; i++) {
            System.out.println(half2[i]);
        }
    }
}
