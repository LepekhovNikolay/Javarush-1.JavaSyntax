package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 3;
        String[] s = new String[count];
        int[] i = new int [count];
        for (int j = 0; j < count; j++) {
            s[j] = reader.readLine();
            i[j] = Integer.parseInt(s[j]);
        }
        //к этому моменту я записал три стороны в массив i[]
        if (i[0] + i[1] > i [2])
            if (i[0] + i[2] > i [1])
                if (i[1] + i[2] > i [0]){
                    System.out.println("Треугольник существует.");
                    count = 1000;
                }
         if (count != 1000)
             System.out.println("Треугольник не существует.");
    }
}