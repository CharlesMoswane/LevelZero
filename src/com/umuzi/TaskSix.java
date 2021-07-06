package com.umuzi;

public class TaskSix {

    public double maximum(double ... numbers){
        double max = 0;

        for (double number : numbers){
            if (number > max)
                max = number;
        }

        return max;
    }

}
