package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        int line = 10, column = 10;
        while (line>0){
            //цикл добавления 10 символов
            while (column>0){
                System.out.print("S");
                column--;
            }
            if (line != 1)
                System.out.print("\n");
            column=10;
            line--;
        }

    }
}
