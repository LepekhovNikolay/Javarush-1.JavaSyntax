package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        int count = 50000;
        Cat[] cat = new Cat[count];
        Dog[] dog = new Dog[count];
        for (int i = 0; i < count; i++) {
            cat[i] = new Cat ();
            dog[i] = new Dog ();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
