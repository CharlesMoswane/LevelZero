package com.umuzi;

public class TaskSix {

    public double maximum(double one, double two, double three){
        System.out.println("\n" + "Task 0.6");

        double max = 0;

        if(one > two && one > three)
            max = one;
        else if(two > three)
            max = two;
        else
            max = three;

        return max;
    }

    public double maximum(double ... numbers){
        System.out.println("\n" + "Task 0.6 Bonus");

        double max = 0;

        for (double number : numbers){
            if (number > max)
                max = number;
        }

        return max;
    }

}
