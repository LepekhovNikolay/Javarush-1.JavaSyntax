package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("мера"); //1
        list.add("лоза"); //2
        list.add("лира"); //3
        list.add("вода"); //4
        list.add("упор"); //5

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        int type;//if = 0 - не содержит ничего, если = 1 - содержит "р", если = 2 - содержит "л"
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            type = 0;
            for (int j = 0; j < element.length(); j++) {
                if (element.charAt(j) == 'л'){
                    type += 2;
                }
                else if (element.charAt(j) == 'р'){
                    type += 1;
                }
            }
            switch (type){
                case 2://слово содержит "л"
                    list.add(i+1, list.get(i));
                    i++;
                    break;
                case 1://слово содержит "р"
                    list.remove(i);
                    i--;
                    break;

            }


        }
        return list;
    }
}