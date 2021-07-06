package com.umuzi;

public class TaskSeven {

    public double celsiusToFahrenheit(double temperature){
        double temperatureInFahrenheit = (temperature * (double) 9 / 5) + 32;

        return temperatureInFahrenheit;
    }

    public double fahrenheitToCelsius(double temperature) {
        double temperatureInFahrenheit = (temperature - 32) * (double)5 / 9;

        return temperatureInFahrenheit;
    }

}
