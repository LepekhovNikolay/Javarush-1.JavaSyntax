package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] house = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0, noteven = 0;
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(reader.readLine());
            if(i%2==0)
                even += house[i];
            else
                noteven += house[i];
        }
        if (even > noteven)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (noteven>even)
            System.out.println("В домах с нечетными номерами проживает больше жителей." );

    }
}
