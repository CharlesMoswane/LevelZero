package com.umuzi;

public class TaskTen {

    public void commonLetters(String word1, String word2){
        String lowerCaseWord1 = word1.toLowerCase();
        String lowerCaseWord2 = word2.toLowerCase();
        char[] word2Letters = lowerCaseWord2.toCharArray();
        StringBuilder commonLetters = new StringBuilder();

        for (char character : word2Letters){
            String letter = Character.toString(character);
            if (lowerCaseWord1.contains(letter)){
                commonLetters.append(character + ", ");
                lowerCaseWord1 = removeDuplicateCharacters(lowerCaseWord1,letter);
            }
        }
        commonLetters.delete(commonLetters.length()-2,commonLetters.length()-1);
        System.out.println(commonLetters.toString());
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
