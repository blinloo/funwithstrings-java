package net.fun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int option = menuOptions();
        while (option <> 0) {
            switch (option) {
                case 1: //Reverse string

                    break;
                case 2: //Randomize character case

                    break;
                case 3: //Pig Latin

                    break;
                default: System.out.println("Not a valid option, please select an option from the menu"); break;
            }
        }
//        Scanner s = new Scanner(System.in); //for input and output from console
//        System.out.print("Enter Text: ");
//        String inputText = s.nextLine(); //takes in the next line and stores in string variable "inputText"
        //System.out.println("Your text in Pig Latin: ", outputText);
    }
    private static String getUserString() {
        Scanner s = new Scanner(System.in); //for input and output from console
        System.out.print("Your text: ");
        String inputText = s.nextLine(); //takes in the next line and stores in string variable "inputText"
        return inputText;
    }

    private static int menuOptions() {
        Scanner s = new Scanner(System.in); //for input and output from console
        int option = 0;
        System.out.println("");

        return option;
    }

    private static String reverseString() {

    }
}