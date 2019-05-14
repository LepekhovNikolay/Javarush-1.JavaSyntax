package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int b = s.length();
        String lgt = null;
        switch (b) {
            case 1:
                lgt = "однозначное";
                break;
            case 2:
                lgt = "двузначное";
                break;
            case 3:
                lgt = "трехзначное";
                break;
        }
        if (a >= 1 && a <= 999) {
            if (a % 2 == 0)//четное
                System.out.println("четное " + lgt + " число");
            else if (a % 2 != 0)
                System.out.println("нечетное " + lgt + " число");
        }
    }
}