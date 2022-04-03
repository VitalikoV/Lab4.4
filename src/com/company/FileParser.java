package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class FileParser {


    public static ArrayList<String> readCSVFile(String fileName) {
        ArrayList<String> sentences = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                sentences.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sentences;
    }


    public static void generateCSVFile(ArrayList<String> sentences, String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));

        for(String sentence : sentences){
            bw.write(sentence);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

    //V-8
//    public static int[][] readCSVFile(String fileName) {
//        int[][] matrix = new int[0][];
//        Path pathToFile = Paths.get(fileName);
//        try (BufferedReader br = Files.newBufferedReader(pathToFile,
//                StandardCharsets.US_ASCII)) {
//            String[] sizeData = br.readLine().split(" ");
//            int n = Integer.parseInt(sizeData[0]);
//            int m = Integer.parseInt(sizeData[1]);
//            matrix = new int[n][m];
//            String line;
//            for (int i = 0; i < n; i++) {
//                line = br.readLine();
//                String[] attributes = line.split(" ");
//                for (int j = 0; j < m; j++) {
//                    int currentNumber = Integer.parseInt(attributes[j]);
//                    matrix[i][j] = currentNumber;
//                }
//            }
//
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        return matrix;
//    }
//
//    public static void generateCSVFile(int[][] matrix, String fileName) throws IOException {
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName + ".txt"), "UTF-8"));
//
//        String lineWithSize = matrix.length + " " + matrix[0].length;
//        bw.write(lineWithSize);
//        bw.newLine();
//
//        for (int i = 0; i < matrix.length; i++) {
//            StringBuilder line = new StringBuilder();
//            for (int j = 0; j < matrix[0].length; j++) {
//                if(j == 0) {
//                    line.append(matrix[i][j]);
//                }else {
//                    line.append(" ").append(matrix[i][j]);
//                }
//            }
//            bw.write(line.toString());
//            bw.newLine();
//        }
//        bw.flush();
//        bw.close();
//    }

}
