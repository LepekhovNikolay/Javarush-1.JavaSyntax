package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {
    public static void divisionByZero() throws Exception{
        int a = 5;
        int c = a/0;
        System.out.println(c);
    }
    public static void main(String[] args) throws Exception{
        try{
        divisionByZero();}
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
