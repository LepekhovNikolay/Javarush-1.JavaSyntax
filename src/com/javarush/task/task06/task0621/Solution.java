package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat grandFather = new Cat (reader.readLine());
        Cat grandMother = new Cat (reader.readLine());
        Cat catFather = new Cat (grandFather, reader.readLine());
        Cat catMother = new Cat(reader.readLine(), grandMother);
        Cat catSon = new Cat (reader.readLine(), catMother, catFather);
        Cat catDaughter = new Cat(reader.readLine(), catMother, catFather);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(Cat father, String name){
            this.name = name;
            this.father = father;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mother != null && father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother == null && father != null)
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else if (mother != null && father != null)
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            else return"";
        }
    }

}
