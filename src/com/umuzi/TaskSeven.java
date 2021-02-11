package com.umuzi;

public class TaskSeven {

    public double celsiusToFahrenheit(double temperature){
        System.out.println("\n" + "Task 0.7");

        double temperatureInFahrenheit = (temperature * (9/5)) + 32;

        return temperatureInFahrenheit;
    }

    public double fahrenheitToCelsius(double temperature) {
        System.out.println("\n" + "Task 0.7");

        double temperatureInFahrenheit = (temperature - 32) * (5 / 9);

        return temperatureInFahrenheit;
    }

}
