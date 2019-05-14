package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[3];
        for (int i = 0; i < 3; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }
        if (number[0] == number[1])
            System.out.println(3);
        else if (number[0] == number[2])
            System.out.println(2);
        else if (number[1] == number[2])
            System.out.println(1);
    }
}
