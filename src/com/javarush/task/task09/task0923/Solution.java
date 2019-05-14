package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] symbols = reader.readLine().toCharArray();
        ArrayList<Character> myVowels = new ArrayList<>();
        ArrayList<Character> myConsonats = new ArrayList<>();
        for (int i = 0; i < symbols.length; i++) {
            if(isVowel(symbols[i])){
                myVowels.add(symbols[i]);
                myVowels.add(' ');
            }
            else if(symbols[i] != ' '){
                myConsonats.add(symbols[i]);
                myConsonats.add(' ');
            }
        }
        myVowels.forEach(v-> System.out.print(v));
        System.out.println();
        myConsonats.forEach(v-> System.out.print(v));
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}