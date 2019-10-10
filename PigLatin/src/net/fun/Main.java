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
                    System.out.println("You text reversed: " + reverseString(getUserString()));
                    break;
                case 2: //Randomise character case
                    System.out.println("Enter text to randomise case of");
                    System.out.println("You text case randomised: " + randomiseString(getUserString()));
                    break;
                case 3: //Pig Latin
                    System.out.println("Enter text to translate into Pig Latin");
                    System.out.println("You text in Pig Latin: " + pigLatinify(getUserString()));
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

    private static int menuOptions()
    {
        int option = 0;
        System.out.println("Choose one of these options");
        System.out.println("1 - Reverse a string                   2 - Randomise character cases");
        System.out.println("3 - Translate into Pig Latin(simple)   4 - Something exciting and crazy!");
        System.out.println("0 - Exit");
        option = getUserInt(); //calls method to get integer input from user
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
        int length = inputString.length();
        int wordNum = countWords(inputString);

        for (int i = 0; i < wordNum; i++)
        {
            if (inputString.charAt(i)
        }

        String outputString = new String(outputArray);
        return outputString;
    }
}