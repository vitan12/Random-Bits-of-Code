package com.example.WordFunnel;
import java.util.Scanner;


public class wordFunnel {

    private static boolean compareWords(String word1, String word2){
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
    public static void main(String [] args){
        String input1;
        String input2;
        System.out.println("This program will attempt to see if the second word given can be made from removing a letter from the first word.");
        System.out.println("Please enter Word 1:");
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextLine();
        System.out.println("Please Enter Word 2");
        Scanner scanner1 = new Scanner(System.in);
        input2  = scanner.nextLine();
        System.out.println("The program will compare: "+input1+" and "+input2);
        System.out.println(compareWords(input1, input2));

    }

}
