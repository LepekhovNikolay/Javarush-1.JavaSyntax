package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int row = 1, column = 1;
        while (row < 11){
            while (column <11){
                System.out.print((column * row));
                if(column !=10)
                    System.out.print(" ");

                column++;
            }
            if(row != 10)
                System.out.print("\n");
            column = 1;
            row++;
        }

    }
}
