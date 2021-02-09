package com.umuzi;

public class TaskSeven {
    //Task 0.7
    public double celsiusToFahrenheit(double temperature){
        System.out.println("\n" + "Task 0.7");

        double temperatureInFahrenheit = (temperature * (9/5)) + 32;

        return temperatureInFahrenheit;
    }

    //Task 0.7
    public double fahrenheitToCelsius(double temperature) {
        System.out.println("\n" + "Task 0.7");

        double temperatureInFahrenheit = (temperature - 32) * (5 / 9);

        return temperatureInFahrenheit;
    }

}
