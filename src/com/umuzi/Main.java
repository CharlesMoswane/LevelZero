package com.umuzi;

public class Main {

    public static void main(String[] args) {
        TaskOne task1 = new TaskOne();
        TaskTwo task2 = new TaskTwo();
        TaskThree task3 = new TaskThree();

        //Example of function calls
        task1.taskOne();
        task2.taskTwo();
        task3.hello("Charles");

        //Fixing errors
        //Task 8
        TaskEight task8 = new TaskEight();
        task8.hoursAndMinutes(180);

        //Task 5
        TaskFive task5 = new TaskFive();
        double area = task5.areaOfATriangle(5,3,4);
        System.out.println(area);

    }

}
