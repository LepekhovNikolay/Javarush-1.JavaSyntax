package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        boolean cycle = true;
        int value = 0;
        //цикл чтения
        while(true) {
            String readFromConsole = reader.readLine();
            if (readFromConsole.isEmpty())
                break;
            if (cycle == true) {
                try {
                    value = Integer.parseInt(readFromConsole);
                    cycle = false;
                } catch (Exception e){ ;}
            }
            else{
                map.put(readFromConsole, value);
                cycle = true;
            }
        }
        //цикл вывода
        map.forEach((k,v) -> System.out.println(v + " " + k));
        if(cycle == false)
            System.out.println(value);
    }
}
