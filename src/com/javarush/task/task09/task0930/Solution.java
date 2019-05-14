package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        //разделяю на два массива
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i]))
                numbers.add(Integer.parseInt(array[i]));
            else
                words.add(array[i]);
        }
        //Выравниваю цифры в правильном порядке
        Collections.sort(numbers);
        //Выравниваю слова в правильном порядке пузырьком
        int indexMin;
        String min;
        for (int i = 0; i < words.size(); i++) {
            min = words.get(i);
            indexMin = i;
            for (int j = i+1; j < words.size(); j++) {
                if(isGreaterThan(min, words.get(j))){
                    min = words.get(j);
                    indexMin = j;
                }
            }
            if(isGreaterThan(words.get(i), min)){
                words.set(indexMin, words.get(i));
                words.set(i, min);
            }
        }
        //объединяю массивы
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(numbers.get(numbers.size()-1));
                numbers.remove(numbers.size()-1);
            }
            else {
                array[i] = words.get(0);
                words.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
