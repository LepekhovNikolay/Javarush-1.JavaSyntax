package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static int members = 4;
    public static int[] a = new int[members];

    public static void main(String[] args) throws Exception {
        init_massiv();
        max();
        System.out.println("Наибольшее из введенных чисел " +a[0]);
    }
    public static void max (){
        for (int i = 1; i < members; i++) {
            if (a[i] > a[0])
                a[0] = a[i];
        }
    }
    public static void init_massiv() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < members; i++) {
            System.out.println("Введите число " + (i+1));
            a[i] = Integer.parseInt(reader.readLine());
        }
    }
}
