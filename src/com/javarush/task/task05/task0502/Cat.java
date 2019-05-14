package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int result=0;
        if (this.age > anotherCat.age) result++;
        else    result--;
        if (this.weight > anotherCat.weight) result++;
        else result--;
        if (this.strength >anotherCat.strength) result++;
        else result--;
        if(result>0) return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
