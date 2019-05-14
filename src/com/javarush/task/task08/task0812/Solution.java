package com.javarush.task.task08.task0812;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max = 1, count = 0, previuosValue=0;
        Iterator<Integer> iterator = list.iterator();
        if (iterator.hasNext()) {
            previuosValue = (int) iterator.next();
            count++;
        }
        for (int i = 0; iterator.hasNext(); i++) {
            int currentValue = (int) iterator.next();
            if (previuosValue == currentValue)
                count++;
            else{
                if (count >= max)
                    max = count;
                count = 1;
            }
            previuosValue = currentValue;
        }
        if (max<count)
            max=count;
        System.out.println(max);

    }

}