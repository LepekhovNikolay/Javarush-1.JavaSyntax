package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        boolean m = true;
        while (m){
            int temp = Integer.parseInt(reader.readLine());
            if (temp == -1)
                m=false;
//                break;
            result += temp;
        }
        System.out.print(result);
    }
}
