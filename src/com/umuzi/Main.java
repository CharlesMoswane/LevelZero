package com.umuzi;

public class Main {

    public static void main(String[] args) {
        TaskOne task1 = new TaskOne();
        TaskTwo task2 = new TaskTwo();
        TaskThree task3 = new TaskThree();
        TaskEight task8 = new TaskEight();

        //Example of function calls
        task1.taskOne();
        task2.taskTwo();
        task3.hello("Charles");
        task8.hoursAndMinutes(180);
    }

}
