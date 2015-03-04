// Marc Laflamme
// March 3 2015
// MakeSymbols.java:generate an integer between 0 and 100. You will first need to print out the number.
//If the number is even, you will then print out that number of “*” 
//characters; if the number is odd, then you will print out that number of “&” characters.   
// importing the scanner and random utilities
import java.util.Scanner;
import java.lang.Math;

// creating a class
public class MakeSymbols{
    public static void main (String [] args){
        
        // make a random number
        double randomNumber = Math.random();
        // declaring range
        randomNumber = ((randomNumber + 1) * 100) - 100;
        // remove recimals by casting to int
        int randomNumber1 = (int) randomNumber;
        // display value
        System.out.println("Number generated is: " +randomNumber1);
           // initializing the counter variabl
        int number = 1; //number int =1
        System.out.print("Generated pattern: ");
        // checking if even or odd
         if (randomNumber1 % 2 == 0){
         //
            do {
                System.out.print("*"); //print asterik
                number++; //increment the statement
            } while (number < randomNumber1); // initialize while statement
        }
        if (randomNumber1%2 == 1){
            // ampersands if odd
            do {
                System.out.print("&");  //print ampersand
                number++;
            } while (number < randomNumber1);// if less than random number ^^
        }
        System.out.println(" "); // print so that it goes to new line
}
}