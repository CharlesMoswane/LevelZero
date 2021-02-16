package com.umuzi;

public class TaskTen {

    /*Earlier it was requested that the repeating vowels should not be
      printed out more than once. I am thus baffled by the request to "Print
      out all the vowels." Does this override the earlier requirement or
      it means something entirely different?*/
    public void commonLetters(String word1, String word2){
        System.out.println("\n" + "Task 0.10" + "\n");

        String lowerCaseWord1 = word1.toLowerCase();
        String lowerCaseWord2 = word2.toLowerCase();
        char[] word2Letters = lowerCaseWord2.toCharArray();
        String commonLetters = "";

        System.out.println("Common Letters:");
        for (char l : word2Letters){
            String letter = Character.toString(l);
            if (lowerCaseWord1.contains(letter)){
                System.out.print(l + " ");
                lowerCaseWord1 = removeDuplicateCharacters(lowerCaseWord1,letter);
            }
        }

        System.out.println(commonLetters);
    }

    public static String removeDuplicateCharacters(String word, String character){
        StringBuilder sb = new StringBuilder(word);
        int index = sb.indexOf(character);

        while (index != -1){
            sb.deleteCharAt(index);
            index = sb.indexOf(character);
        }

        return sb.toString();
    }

}
