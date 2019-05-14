package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.lang.Object;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
//        integerList.forEach(System.out::println);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min = Integer.MAX_VALUE;
        for (int temp:array) {
            if (temp<min){
                min=temp;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        ArrayList<Integer> myCollection = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            myCollection.add(Integer.parseInt(reader.readLine()));
        }

        return myCollection;
    }
}
