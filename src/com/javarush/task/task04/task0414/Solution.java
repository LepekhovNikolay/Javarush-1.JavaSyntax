package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sdata = reader.readLine();
        int data = Integer.parseInt(sdata);
        int temp1 = data/100;
        if (temp1*100 != data) {//if not century
            int temp = data / 4;
            if (temp*4 == data){//високосный
                System.out.println("количество дней в году: 366");
            }
            else{//не високосный
                System.out.println("количество дней в году: 365");
            }
        }
        else { //if century
            int temp = data/400;
            if (temp*400 == data){//високосный
                System.out.println("количество дней в году: 366");
            }
            else//не високосный
                System.out.println("количество дней в году: 365");
        }
    }
}