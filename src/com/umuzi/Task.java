package com.umuzi;

public class Task {

    public Task(){

    }

    //Task 0.7
    public double celsiusToFahrenheit(double temperature){
        System.out.println("\n" + "Task 0.7");

        double temperatureInFahrenheit = (temperature * (9/5)) + 32;

        return temperatureInFahrenheit;
    }

    //Task 0.7
    public double fahrenheitToCelsius(double temperature) {
        System.out.println("\n" + "Task 0.7");

        double temperatureInFahrenheit = (temperature - 32) * (5 / 9);

        return temperatureInFahrenheit;
    }

    //Task 0.8
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

    //Task 0.9
    public void printVowels(String word){
        System.out.println("\n" + "Task 0.9" + "\n");
        System.out.println(word);

        char[] vowels = {'a','e','i','o','u'};
        String lowerCaseWord = word.toLowerCase();

        for (char v : vowels){
            String vowel = Character.toString(v);
            if (lowerCaseWord.contains(vowel))
                System.out.print(vowel + " ");
        }
    }

    //Task 0.10
    public void commonLetters(String word1, String word2){
        System.out.println("\n" + "Task 0.10" + "\n");
        System.out.println(word1);
        System.out.println(word2);

        String lowerCaseWord1 = word1.toLowerCase();
        String lowerCaseWord2 = word2.toLowerCase();
        char[] word2Letters = lowerCaseWord2.toCharArray();

        for (char l : word2Letters){
            String letter = Character.toString(l);
            if (lowerCaseWord1.contains(letter))
                System.out.print(letter + " ");
        }
    }
}
