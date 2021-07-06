package com.umuzi;

public class TaskNine {

    public void printVowels(String word){
        char[] vowels = {'a','e','i','o','u'};
        String lowerCaseWord = word.toLowerCase();
        StringBuilder str = new StringBuilder();

        for (char v : vowels){
            String vowel = Character.toString(v);
            if (lowerCaseWord.contains(vowel))
                str.append(vowel + ", ");
        }
        str.delete(str.length()-2,str.length()-1);
        System.out.println(str.toString());
    }

}
