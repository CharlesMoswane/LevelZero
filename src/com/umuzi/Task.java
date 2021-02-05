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

    public double areaOfATriangle(double sideA,double sideB,double sideC){
        double semiperimeter,area;
        //Calculate the semiperimeter of the triangle
        semiperimeter = (1/2) * (sideA + sideB +sideC);
        //The area is then calculated using Heron's formula
        area = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB)
                * (semiperimeter - sideC));
        return area;
    }
}
