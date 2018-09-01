package com.example.WordFunnel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class wordFunnel2 {
    public static boolean compareWords(String word1, String word2){
        if(word2.length() != word1.length() - 1){
            return false;
        }
        for(int i =0; i<word1.length(); i++){
            String splicedWord = word1.substring(0, i)+ word1.substring(i+1);
            if(splicedWord.equals(word2)){
                return true;
            }

        }

        return false;
    }

    public static void main (String [] args) throws IOException{

        String [] fileLines = new String [] {};
        System.out.println("Please enter the path of the word list:");
        Scanner scanner = new Scanner(System.in);
        String filePath  = scanner.nextLine();
        System.out.println("Please enter the word to compare with:");
        Scanner scanner1 = new Scanner(System.in);
        String givenWord = scanner1.nextLine();

        try {
            ReadFile file = new ReadFile(filePath);
            fileLines = file.OpenFile();
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Words this word can make if one letter is removed:");
        int count=0;
        ArrayList answers = new ArrayList();
        for (int i=0; i< fileLines.length; i++){
            if(compareWords(givenWord, fileLines[i])){
                answers.add(fileLines[i]);
                count ++;
            }
        }
        System.out.println(Arrays.toString(answers.toArray()));
        System.out.println("This can make "+ count +" word(s)");
        scanner.close();
        scanner1.close();

        //This part is way too slow

        ArrayList answers1 = new ArrayList();
        for (int i=0; i< fileLines.length; i++){
            int count1 = 0;
            for(int j =0; j< fileLines.length; j++)
            if(compareWords(fileLines[i], fileLines[j])){
                count1 ++;
            }
            if (count1 >4){
                answers1.add(fileLines[i]);
            }
        }
        System.out.println("These are the words that can produce 5 different new words:");
        System.out.println(answers1);

    }
}
