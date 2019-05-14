package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>(5);
        int[] element1 = {1,2,3,4,5};
        int[] element2 = {1,2};
        int[] element3 = {1,2,3,4};
        int[] element4 = {1,2,3,4,5,6,7};
        int[] element5 = new int[0];
        list.add(element1);
        list.add(element2);
        list.add(element3);
        list.add(element4);
        list.add(element5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
