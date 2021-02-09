package com.umuzi;

public class TaskSix {
    //Task 0.6
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
}
