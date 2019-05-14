package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        //поиск количества для каждой буквы из алфавита
        alphabet.forEach(v -> {//v - буква из алфавита
            int count = 0;//Галка начинает счет
            //Здесь ищем количество в 10 строках
            for (int i = 0; i < list.size(); i++) {//повторяем разбор строк в количестве списка
                char[] charsString = list.get(i).toCharArray();//здесь записана текущая строка в массив чаров
                for (int j = 0; j < charsString.length; j++) {//разбор каждой строки
                    if  (v == charsString[j])
                        count++;//если искомая буква и рассматриваемая буква совпадают, то счетчик прибавляем
                }
            }
            System.out.println(v + " " + count);//ну и наконец вывожу значения
        });

    }

}
