package com.example.ReverseString;
import java.util.Scanner;

public class reverseString {

    private static String reversal (String input){
        String newString = "";
        for (int i = input.length()-1; i>=0; i--){
            newString += input.charAt(i);
        }
        return newString;
    }
    public static void main (String[] args) {

        String reverseString;
        System.out.println("Hello World");
        System.out.println("Enter the String you want to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        reverseString  = scanner.nextLine();
        System.out.println("Your inputted String is is " + reverseString);

        System.out.println("The Reverse of this String is: " + reversal(reverseString));
        scanner.close();

    }

}
