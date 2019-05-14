package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
        System.out.println("Новое количество котов равно " + Cat.catsCount);//напишите тут ваш код
    }

    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String count = reader.readLine();
//        setCatsCount(Integer.parseInt(count));
        setCatsCount(5);
    }
}// TODO: 09.08.2018
