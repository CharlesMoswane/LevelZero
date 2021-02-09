package com.umuzi;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        TaskOne task1 = new TaskOne();
        TaskTwo task2 = new TaskTwo();
        TaskThree task3 = new TaskThree();

        //Example of function calls
        task1.taskOne();
        task2.taskTwo();
        task3.hello("Charles");
    }

}
