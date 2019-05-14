package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i=0;i<m;i++){
            for (int i1 = 0; i1 < n; i1++) {
                System.out.print("8");
            }
            if (i != (m-1))
            System.out.println("");
        }

    }
}
