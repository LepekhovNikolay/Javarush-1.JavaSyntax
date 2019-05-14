package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            for (int i1 = 0; i1 < i; i1++){
                System.out.print("8");
            }
            if(i != 10){
                System.out.println("");
            }
        }

    }
}
