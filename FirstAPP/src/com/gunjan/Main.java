package com.gunjan;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        char a = 'A';
        int number = 343;
        Date date = new Date();
        //primitive data type
        byte theByte = -128;
        short theInt = 52_33;
        long theLong = 342_234_432;
        // decimals
        float pi = 3.14F;
        double doublePi = 3.14_15;
        boolean isTrue = true;
        char nameInit = 'g';
        //reference type
        String name = new String("gunjan");
        int age = 34;
        char c = 'a';
        LocalDate now = LocalDate.now();
        //System.out.println(now.getMonth());

        //ref types
        Person gunjan = new Person("gunjan");
        Person alex = gunjan;
//        System.out.println("before changing");
//        System.out.println(gunjan.name + "-" + alex.name);

        gunjan.name = "Gunjan Paul";
//        System.out.println("after changing");
//        System.out.println(gunjan.name + "-" + alex.name);

        //string
        String myName = "gunjan";
        System.out.println(myName.hashCode());
        System.out.println(myName.contains("jan"));


        //array
        int[] numbers = new int[5];
        numbers[0] = 34;
        System.out.println(Arrays.toString(numbers));
        int[] newNumbers = {23, 54, 34, 6, 34};
        System.out.println(Arrays.toString(newNumbers).length());
        String[] names = {"gunjan", "mimo"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[1]);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
