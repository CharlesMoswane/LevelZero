package com.umuzi;

public class TaskFive {
    //Task 0.5
    public double areaOfATriangle(double sideA,double sideB,double sideC){
        System.out.println("\n" + "Task 0.5");

        double semiperimeter,area;
        //Calculate the semiperimeter of the triangle
        semiperimeter = (1/2) * (sideA + sideB +sideC);
        //The area is then calculated using Heron's formula
        area = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB)
                * (semiperimeter - sideC));
        return area;
    }
}
