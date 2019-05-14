package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Addmoney addmoney = new Addmoney (0,0);
        while (true){
            if ("out".equals(addmoney.countMoney()))
                break;
        }
    }
    public static class Addmoney{
        private int count, sum;

        public Addmoney(int count, int sum) {
            this.count = count;
            this.sum = sum;
        }

        public String countMoney() throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String curRead = reader.readLine();
            if ("сумма".equals(curRead) == true){
                System.out.println(sum);
                return "out";
            }
            else{
                count++;
                sum += Integer.parseInt(curRead);
            }
            return "";
        }

    }
}


