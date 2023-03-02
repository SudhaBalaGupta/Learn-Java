package com.sudha.learn;

/**
 * @author Rahul Kesharwani
 */
public class A {
    public static void main(String args[]) {
        double a = (int) 15.8;
        int b = (int) a;
        System.out.println(b);
        System.out.println("" +
            "" +
            "");
        int c = 20;
        System.out.println(c);
        System.out.println("Prepost Decrement");
        System.out.println(c--);
        System.out.println(--c);
        System.out.println("" +
            "" +
            "");

        int d = 16;
        double e = d;
        System.out.println(e);
        System.out.println("" +
            "" +
            "");

        System.out.println("Logical Comparision");
        System.out.println((12 > 5) && (20 < 30));
        System.out.println((2 < 1) && (9 > 5));
        System.out.println((9 > 12) && (13 < 12));
        System.out.println("" +
            "" +
            "");

        int f = 15;
        int g = 35;
        int Max;
        Max = f > g ? f : g;
        System.out.println(f + g);
        System.out.println(Max);
        System.out.println((f > g) && (g < f));
        System.out.println("" +
            "" +
            "");
        int h = 10, i = 15, j = 20, Big;
        Big = h > i ? (h > j ? h : j) : (i > j ? i : j);
        System.out.println(Big);
        System.out.println("" +
            "" +
            "");
        int k = 40;
        if (k < 10)
            System.out.println("k is less than 10");
        else if (k < 20)
            System.out.println("k is less than 20");
        else if (k < 30)
            System.out.println("k is less than 30");
        else if (k <= 40) ;
        System.out.println("k is less than or equal to 40");
        System.out.println("Operation completed");
        System.out.println("" +
            "" +
            "");
        int l = 12, m = 27, n = 53;
        if (n > l) {
            if (n > l)
                System.out.println("Max num is:" + n);
            else
                System.out.println("Max num is:" + l);
            if (n > m)
                System.out.println("Max num is: " + n);
            else
                System.out.println("Max num is:" + m);
        }
    }
}

