package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of the file => ");
        String name = reader.readLine();
        name += ".csv";

        ArrayList<String> sentences = FileParser.readCSVFile("sentences.txt");
        SentenceHandler.printSentences(sentences);

        System.out.println("What action do you want to do?");
        System.out.println("1. Get sentences with identical first and last letters");
        System.out.println("2. Get not empty sentences");
        System.out.println("3. Get sentences that starts with the defined letter");
        System.out.print("Enter number =>");
        Integer action = Integer.parseInt(reader.readLine());
        if(action == 1) {
            ArrayList<String> processedSentences = SentenceHandler.getSentencesWithIdenticalFirstAndLastLetter(sentences);
            SentenceHandler.printSentences(processedSentences);
        }else if(action == 2){
            ArrayList<String> notEmptySentences = SentenceHandler.getNotEmptySentences(sentences);
            SentenceHandler.printSentences(notEmptySentences);
        }else if(action == 3) {
            System.out.print("Enter letter => ");
            char letter = reader.readLine().charAt(0);
            ArrayList<String> sentencesWithStatedFirstLetter = SentenceHandler.getSentencesWithStatedFirstLetter(sentences, letter);
            SentenceHandler.printSentences(sentencesWithStatedFirstLetter);
        }

    }
}
