package com.company;

import java.util.ArrayList;

public class SentenceHandler {

    public static ArrayList<String> getSentencesWithIdenticalFirstAndLastLetter(ArrayList<String> sentences){
        ArrayList<String> sentencesWithIdenticalLetters = new ArrayList<>();
        for(String sentence : sentences){

            char firstSymbol = sentence.charAt(0);
            char lastSymbol = sentence.charAt(sentence.length() - 1);

            if(Character.toLowerCase(firstSymbol) == Character.toLowerCase(lastSymbol)) {
                sentencesWithIdenticalLetters.add(sentence);
            }
        }
        return sentencesWithIdenticalLetters;
    }

    public static ArrayList<String> getSentencesWithStatedFirstLetter(ArrayList<String> sentences, char letter){
        ArrayList<String> sentencesWithStatedFirstLetter = new ArrayList<>();
        for(String sentence : sentences){
            if(sentence.charAt(0) == letter) {
                sentencesWithStatedFirstLetter.add(sentence);
            }
        }
        return sentencesWithStatedFirstLetter;
    }

    public static ArrayList<String> getNotEmptySentences(ArrayList<String> sentences){
        ArrayList<String> notEmptySentences = new ArrayList<>();
        for(String sentence : sentences){
            if(sentence != null && !sentence.equals("") && !sentence.equals(" ")) {
                notEmptySentences.add(sentence);
            }
        }
        return notEmptySentences;
    }

    public static void printSentences(ArrayList<String> sentences){
        for(String sentence: sentences){
            System.out.println("sentence: " + sentence);
        }
    }
}
