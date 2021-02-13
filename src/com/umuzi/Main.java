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
        task8.hoursAndMinutes(18);

        //Task 5
        TaskFive task5 = new TaskFive();
        double area = task5.areaOfATriangle(5,3,4);
        System.out.println(area);

        //Task 6
        TaskSix task6 = new TaskSix();
        double max = 0;
        max = task6.maximum(3,7,4);
        System.out.println(max);

        max = task6.maximum(1,2,3,4,5,6);
        System.out.println(max);

        //Task 9
        TaskNine task9 = new TaskNine();
        task9.printVowels("Hey There");
        //I cannot replicate the problem. The vowel is only printed once.

    }

}
