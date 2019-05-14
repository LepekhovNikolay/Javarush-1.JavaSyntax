package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        try{
        printList(arrayOfStringList);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[3];
        ArrayList<String> list0 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            list1.add("dsfadsd");
            list2.add("12312");
            list0.add("afsdvz");
        }
        list[0] = list0;
        list[1] = list1;
        list[2] = list2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}