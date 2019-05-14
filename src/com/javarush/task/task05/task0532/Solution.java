package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while (true) {
            n = Integer.parseInt(reader.readLine());
            if (n >0)
                break;
        }

        int maximum = Integer.parseInt(reader.readLine());
        n--;
        if (n!=0) {
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(reader.readLine());
                if (temp>maximum)
                    maximum=temp;
            }
        }

        System.out.println(maximum);
    }
}
