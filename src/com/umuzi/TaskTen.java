package com.umuzi;

public class TaskTen {

    public void commonLetters(String word1, String word2){
        System.out.println("\n" + "Task 0.10" + "\n");

        String lowerCaseWord1 = word1.toLowerCase();
        String lowerCaseWord2 = word2.toLowerCase();
        char[] word2Letters = lowerCaseWord2.toCharArray();
        String commonLetters = "";

        for (char l : word2Letters){
            String letter = Character.toString(l);
            if (lowerCaseWord1.contains(letter) && !(commonLetters.contains(letter)))
                 commonLetters =  commonLetters + letter + " ";
        }

        System.out.println(commonLetters);
    }

}
