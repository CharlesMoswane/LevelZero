package com.umuzi;

public class TaskFive {

    public double areaOfATriangle(double sideA,double sideB,double sideC){
        double semiperimeter,area;

        semiperimeter = 0.5 * (sideA + sideB +sideC);
        //The area is calculated using Heron's formula
        area = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB)
                * (semiperimeter - sideC));

        return area;
    }

}
