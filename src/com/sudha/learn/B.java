package com.sudha.learn;

import java.util.Scanner;

/**
 * @author Rahul Kesharwani
 */
public class B {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:  ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + b);
        System.out.println("" +
            "" +
            "");
        int age;
        age = sc.nextInt();
        if (age >= 18)
            System.out.println("Candidate is eligible for voting");
        else System.out.println("Candidate is not eligible");

    }
}
