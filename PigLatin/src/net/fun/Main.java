package net.fun;
//blinloo

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Code that runs on startup. Checks the menu is working
        int option;
        do
        {
            option = menuOptions();
            switch (option) {
                case 1: //Reverse string
                    System.out.println("Enter text you would like to reverse");
                    System.out.println("Your text reversed: " + reverseString(getUserString()));
                    break;
                case 2: //Randomise character case
                    System.out.println("Enter text to randomise case of");
                    System.out.println("Your text case randomised: " + randomiseString(getUserString()));
                    break;
                case 3: //Pig Latin
                    System.out.println("Enter text to translate into Pig Latin");
                    System.out.println("Your text in Pig Latin: " + pigLatinify(getUserString()));
                    break;
                case 4: //Number of words
                    System.out.println("Enter text to calculate number of words");
                    System.out.println("Number of words: " + countWords(getUserString()));
                    break;
                case 0: break;//exit
                default: System.out.println("Not a valid option, please select an option from the menu"); break;
            }
        } while (option != 0);
        System.out.println("Bye!");
    }

    private static String getUserString()
    {
        Scanner s = new Scanner(System.in); //for input and output from console
        System.out.print("Your text: ");
        String inputText = s.nextLine(); //takes in the next line and stores in string variable "inputText"
        return inputText;
    }

    private static int getUserInt()
    {
        Scanner s = new Scanner(System.in); //for input and output from console
        System.out.print("Enter here: ");
        int inputNum = s.nextInt(); //takes in the next int
        return inputNum;
    }

    private static int countWords(String inputString)
    {
        int length = inputString.length() - 1;
        String testString = (inputString.toLowerCase()).concat(" ");
            //puts in lower case to avoid counting confusion and adds a space to ensure last word is counted
        int count = 0;
        char prev = ' ';
        for (int i= 0; i <= length; i++)
        {
            if ((testString.charAt(i) == ' ') && (prev != ' '))
            {
                count++;
            }
        }
        return count;
    }

    private static boolean checkIfVowel(char c) //Checks if entered char is a vowel
    {
        char [] vowelArray = new char[] {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        c = Character.toLowerCase(c); //ensures character inputted is lower case

        for (int j = 0; j < vowelArray.length; j++) //check if vowel
        {
            if (c == vowelArray[j])
            {
                isVowel = true;
            }
        }
        return isVowel;
    }

    private static int menuOptions()
    {
        int option = 0;
        System.out.println("Choose one of these options");
        System.out.println("1 - Reverse a string                   2 - Randomise character cases");
        System.out.println("3 - Translate into Pig Latin(simple)   4 - Check number of words");
        System.out.println("0 - Exit");
        option = getUserInt(); //Calls method to get integer input from user
        return option;
    }

    private static String reverseString(String inputString)
    {
        int length = inputString.length() - 1;
        char[] outputArray = inputString.toCharArray();

        for (int i = 0;i <= length; i++) {
            //Steps through all characters in the string and
            outputArray[length - i] = inputString.charAt(i);
        }

        String outputString = new String(outputArray);
        return outputString;
    }

    private static String randomiseString(String inputString)
    {
        Random rand = new Random();
        int length = inputString.length() - 1;
        char[] outputArray = inputString.toCharArray();

        for (int i = 0; i <= length; i++) {
            int n = rand.nextInt(2); //generates random number, either 0 or 1
            if (n == 0) {
                outputArray[i] = inputString.toUpperCase().charAt(i);
            }
            if (n == 1)
            {
                outputArray[i] = inputString.toLowerCase().charAt(i);
            }
        }

        String outputString = new String(outputArray);
        return outputString;
    }

    private static String pigLatinify(String inputString)
    {
        char[] outputArray = inputString.toCharArray();
        String outputString = inputString;
        int length = inputString.length();
        int wordNum = countWords(inputString);


        for (int i = 0; i < wordNum; i++)
        {
            if (inputString.charAt(0) != ' ')
            {
                if (checkIfVowel(inputString.charAt(0))) //if first char is a vowel
                {
                    outputString.concat("way");
                } else //if first char is consonant
                {

                    outputString = new String(outputArray);
                }
            }
        }

        return outputString;
    }
}