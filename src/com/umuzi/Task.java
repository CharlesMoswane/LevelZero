package com.umuzi;

public class Task {

    public Task(){

    }

    public void hello(String name){
        System.out.println("Hello " + name);
    }

    public void evenOrOdd(int num){
        double remainder = num%2;
        if (remainder != 0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
