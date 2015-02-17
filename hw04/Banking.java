// Marc Laflamme 
// Homework 04 Banking, February 14th 2015, CSE 2
// Write a program that takes the users input to determine which number
// from 1-10 they are thinking of by utilizing yes or no responses
//
import java.util.Scanner; //import scanner class
import java.util.Random; //import random generator
//set up class
public class Banking{
    //make main method
   
    
    public static void main(String[] args){
        
        Scanner myScanner;//declare scanner
        myScanner= new Scanner (System.in); // setup variable input
        Random rand = new Random(); // setup random 
        int bankBalance = rand.nextInt((5000 - 1000) + 1) + 1000;
        //create a random number between 1000 and 5000 and store it to bank amount
   
    
        System.out.print("Would you like to deposit, withdraw, or view balance? Enter 1, 2, or 3 respectively. ");
              //ask for choice 
        int bankChoice = myScanner.nextInt();//accept user input
        
        if (bankChoice == 1) {
             System.out.print("How much would you like to deposit? ");
              //ask for amount to deposit
             int depositAmount = myScanner.nextInt();//accept user input
             if (depositAmount >=0 ) {
                 int newBalance = bankBalance + depositAmount;
                 //add deposit amount
                 System.out.println("You have " + newBalance + " in your account.");// print new balance
             }
             else {
                 System.out.println("You did not give a positive integer.");
             }
            
        }
        if (bankChoice == 2) {
             System.out.print("How much would you like to withdraw? ");
              //ask for amount to deposit
              int withdrawAmount = myScanner.nextInt();//accept user input
             if (withdrawAmount >=0) {
                 int newBalance = bankBalance - withdrawAmount;
                 //subtract deposit amount
                 System.out.println("You have " + newBalance + " in your account.");// print new balance
             }
             else {
                 System.out.println("You did not give a positive integer."); // return error for innapropriate num
             }
        if (bankChoice == 3) {
            System.out.println("Your current balance is: " + bankBalance);// print balance 
        }
        }
    }
}
    