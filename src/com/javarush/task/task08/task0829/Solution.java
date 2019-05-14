package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> book = new HashMap<>();
        while(true){
            String city = reader.readLine();
            if (city.isEmpty())
                break;
            String family = reader.readLine();
            if (family.isEmpty())
                break;
            book.put(city, family);
        }

        String city = reader.readLine();
        if (book.containsKey(city))
            System.out.println(book.get(city));
    }
}
