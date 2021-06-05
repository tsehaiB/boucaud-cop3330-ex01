package base;

import java.util.Scanner;

public class App    {
    public static void main(String[] args)
    {
        /* Program creates a new instance of scanner to take in user input
           Prints a prompt for user input
           saves user input to variable 'name'
           puts the name in the greeting
           and prints out the completed greeting (input, concatenation, and output are seperate)
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = inp.nextLine();
        String concatenation = "Hello, " + name + ", nice to meet you!";
        System.out.println(concatenation);
    }
}
