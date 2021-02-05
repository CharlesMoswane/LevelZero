package com.umuzi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        taskOne();
        taskTwo();

    }

    private static void taskOne() {
        int x = 0;
        int y = 1;
        System.out.println("Task 0.1");
        System.out.println(x);
        System.out.println(y);
        x = x + 3;
        y = y + x;
        System.out.println(x);
        System.out.println(y);
    }

    private static void taskTwo() {
        int x,y,z,a,b;

        x = 1 + 1 * 2;
        y = (1 + 1) * 2;
        z = 1 + (1 * 2);
        a = 1 + 1 * 2 / 2;
        b = (1 + 1 * 2) / 2;

        System.out.println("\n" + "Task 0.2");
        System.out.println(x + "\n" + y + "\n" + z + "\n" + a + "\n" + b);
    }



}
