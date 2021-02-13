package com.umuzi;

public class TaskNine {

    public void printVowels(String word){
        System.out.println("\n" + "Task 0.9" + "\n");

        char[] vowels = {'a','e','i','o','u'};
        String lowerCaseWord = word.toLowerCase();

        for (char v : vowels){
            String vowel = Character.toString(v);
            if (lowerCaseWord.contains(vowel))
                System.out.print(vowel + " ");
        }
        System.out.println();
    }

}
