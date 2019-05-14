package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> months = new HashMap<>(12);
        months.put("January", " is the 1 month");
        months.put("February", " is the 2 month");
        months.put("March", " is the 3 month");
        months.put("April", " is the 4 month");
        months.put("May", " is the 5 month");
        months.put("June", " is the 6 month");
        months.put("July", " is the 7 month");
        months.put("August", " is the 8 month");
        months.put("September", " is the 9 month");
        months.put("October", " is the 10 month");
        months.put("November", " is the 11 month");
        months.put("December", " is the 12 month");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();
        months.forEach((k,v)->{
            if (key.equals(k))
                System.out.println(k + v);
        });
    }
}
