package com.example.PigLatin;

import java.util.Scanner;

public class pigLatin {
    static char [] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static boolean isVowel(char input){
            for (int j = 0; j < vowels.length; j++) {
                if (input == vowels[j]) {
                    return true;
                }
            }
        return false;
    }

    public static String translator(String input){
        String translatedString="";
        int indexOfFirstVowel=0;

        for(int i = input.length()-1; i>=0; i--) {
            for(int j = 0; j<vowels.length; j++){
                if(input.charAt(i) == vowels[j]){
                    indexOfFirstVowel = i;
                }

            }
        }
        translatedString = input.substring(indexOfFirstVowel)+ input.substring(0, indexOfFirstVowel) +"ay";
        int firstConsonant = 0;
        if(indexOfFirstVowel == 0) {
            for (int i = 0; i<input.length(); i++){
                if(!isVowel(input.charAt(i))){
                    firstConsonant = i;
                    break;
                }
            }
            translatedString = input.substring(firstConsonant+1)+input.substring(0,firstConsonant+1)+"ay";
        }
        return translatedString;
    }

    public static void main(String [] args){
        String input;
        //System.out.println("Hello World");
        System.out.println("Enter the String you want to be translated: ");
        Scanner scanner = new Scanner(System.in);
        input  = scanner.nextLine();
        System.out.println("Your inputted String is is " + input);
        System.out.println("The translated String is: "+translator(input.toLowerCase()));
        scanner.close();


    }

}
