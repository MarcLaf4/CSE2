// Marc Laflamme 
// March 3 2015
//GetInteger.java:Ask the user for 5 non-negative integers (if an invalid value is entered, then ask again, using a loop),
//and print out the sum of the 5 integers. 
import java.util.Scanner;
    
public class GetIntegers{
    public static void main (String [] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.println("Please provide 5 non-negative integers: ");
        int sum=0;// intiialize sum at 0
        int givenNumber= 1; // initilaize given number at 1
        while (givenNumber < 6){ 
            //allow for 5 inputs
            int number = myScanner.nextInt();// take input
            if (number < 0){
                System.out.print("You didn't follow directions. Please enter a new number: ");
                //error if wrong input
            }
            else{
                sum = sum + number;
                givenNumber = givenNumber + 1;
                //increment value of sum
            }
        }
        System.out.println("The sum is: " + sum);
        //print value of the sum
    }
}