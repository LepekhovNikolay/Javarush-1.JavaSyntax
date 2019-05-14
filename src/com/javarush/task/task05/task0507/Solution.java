package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static class Arifm {
        private int count = 0;
        private int sum = 0;
        public boolean add (int temp){
            if ( temp == -1){//признак конца программы
                if (sum == 0 || count == 0)//если ничего не вводил, то просто вывожу ноль
                    System.out.printf("%.1f", (double) sum);
                else{//если что-то вводил, то ищу среднеафиметическое и восстанавливаю переменные в первозданный вид
                    System.out.println((double) sum / count);
                    count = 0;
                    sum = 0;
                }
                return true;//выход из цикла while
            }
            else{//если нет признака конца программы, то просто увеличеваю счетчик и сумму
                sum += temp;
                count ++;
                return false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Arifm arifm = new Arifm();//создаю объект
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//открываю себя потокам энергии
        boolean ret = false;//признак выхода из цикла while
        while (!ret){
            ret = arifm.add(Integer.parseInt(reader.readLine()));// вызываю метод add и передаю туда данные с клавиатуры
        }//выхожу, если arifm.add выдает true
    }
}

