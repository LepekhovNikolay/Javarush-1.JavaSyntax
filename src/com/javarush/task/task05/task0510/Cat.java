package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int weight, weightMedial = 12, age, ageMedial = 8;
    private String color, colorMedial = "серый", address;


    public void initialize (String name){//Имя
        this.name = name;
        this.weight = weightMedial;
        this.age = ageMedial;
        this.color = colorMedial;
    }

    public void initialize (String name, int weight, int age){//имя, вес, возраст
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = colorMedial;
    }

    public void initialize (String name, int age){//имя, возраст
        this.name = name;
        this.weight = weightMedial;
        this.age = age;
        this.color = colorMedial;
    }

    public void initialize (int weight, String color){//вес, цвет
        this.weight = weight;
        this.age = ageMedial;
        this.color = color;
    }

    public void initialize (int weight, String color, String adress){//вес, цвет, адрес
        this.weight = weight;
        this.age = ageMedial;
        this.color = color;
        this.address = adress;
    }

    public static void main(String[] args) {

    }
}
