package com.umuzi;

public class TaskEight {

    public void hoursAndMinutes(int number){
        System.out.println("\n" + "Task 0.9");

        int hours = number/60;
        int minutes = number%60;

        if(hours > 1 && minutes > 1)
            System.out.println(hours + " hours, " + minutes + " minutes");
        else if(hours > 1 && minutes <= 1)
            System.out.println(hours + " hours, " + minutes + " minute");
        else if(hours <= 1 && minutes > 1)
            System.out.println(hours + " hour, " + minutes + " minutes");
        else
            System.out.println(hours + " hour, " + minutes + " minute");
    }

}
