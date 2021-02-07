package com.umuzi;

public class Task {

    public Task(){

    }

    //Task 0.3
    public void hello(String name){
        System.out.println("Hello " + name);
    }

    //Task 0.4
    public void evenOrOdd(int num){
        double remainder = num%2;
        if (remainder != 0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

    //Task 0.5
    public double areaOfATriangle(double sideA,double sideB,double sideC){
        double semiperimeter,area;
        //Calculate the semiperimeter of the triangle
        semiperimeter = (1/2) * (sideA + sideB +sideC);
        //The area is then calculated using Heron's formula
        area = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB)
                * (semiperimeter - sideC));
        return area;
    }

    //Task 0.6
    public double maximum(double one, double two, double three){
        double max = 0;

        if(one > two && one > three)
            max = one;
        else if(two > three)
            max = two;
        else
            max = three;

        return max;
    }

    //Task 0.7
    public double celsiusToFahrenheit(double temperature){
        double temperatureInFahrenheit = (temperature * (9/5)) + 32;

        return temperatureInFahrenheit;
    }

    //Task 0.7
    public double fahrenheitToCelsius(double temperature) {
        double temperatureInFahrenheit = (temperature - 32) * (5 / 9);

        return temperatureInFahrenheit;
    }

}
