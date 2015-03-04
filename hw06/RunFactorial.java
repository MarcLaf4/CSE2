// Marc Laflamme 
// HW07, March 3 2015, CSE 2
// write a program that uses while-loop to solve factorial programs.
//input an integer that is between 9 and 16 inclusively. 
//
//set up class
import java.util.Scanner;
    
public class RunFactorial{
    public static void main (String [] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.println("Enter a number between 9 and 16: ");
        int givenNumber= myScanner.nextInt(); // take input
        int factorial=1;// counter for factorial
        while (givenNumber <9 || givenNumber>16){
                System.out.print("You didn't follow directions. Please enter a new number: ");
                givenNumber= myScanner.nextInt();
                // takes anv verifies given number for between 9 and 16
         }
            while (givenNumber>0) {
                 factorial=givenNumber*factorial;// calculate factorial
                 givenNumber--;// increments the number to calculate factorial in loop
            }
            // calculated and deincrements
            System.out.println("The factorial is: " + factorial); // print result
        }
        
    }
