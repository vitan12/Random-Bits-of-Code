package com.example.palindromes;

import java.util.Scanner;

public class Palindromes {

    static boolean isPalindrome = true;

    public static boolean isPalindrome (String test){
        String test1 = test.toLowerCase();

        for (int i = 0; i < test.length(); i++){
            if(test1.charAt(i) != test1.charAt(test.length()-i-1)){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String [] args){

        String input;
        System.out.println("Enter the String you want to check: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        System.out.println("Your inputted String is is " + input);
        if(isPalindrome(input))
            System.out.println("Yes, it is a palindrome");
        else
            System.out.println("No, it is not a palindrome.");
        scanner.close();


    }

}
