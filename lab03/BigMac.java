//Marc Laflamme
//CSE 2 Lab 3-Big Mac
//February 6, 2015
//using basic inputs and operations to determine outputs
//Write a program that computes the cost of buying a some Big Macs. 
//It uses the Scanner class to obtain from the user how many Big Macs, 
//the cost per Big Mac, and the percentage tax 
// 
import java.util.Scanner; //import scanner class
//set up class
public class BigMac{
    //make main method
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner= new Scanner (System.in); // setup variable input
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
              //prompt input for number of big macs ^
        int nBigMacs = myScanner.nextInt(); //accept user input
        System.out.print("Enter the cost per Big Mac as"+
        " a double (in the form xx.xx): " );// prompt cost of big mac as a double
        double bigMac$ = myScanner.nextDouble();// assign big mac price value
    	System.out.print("Enter the percent tax as a whole number (xx): ");
    	        // prompt tax percent as a whole number ^
         double taxRate = myScanner.nextDouble();// assign the tax rate as a double
         taxRate/=100; //convert from user's percent to proportion
         double cost$; // declare cost variable
        int dollars, dimes, pennies; // declare dollars dimes and pennies as integers
        cost$ = nBigMacs*bigMac$*(1+taxRate);
                //get the whole amount of the purchase, dropping decimal fraction
        dollars=(int)cost$; //get dollar amount
             //get dimes amount where the % (mod) operator returns the remainder
                //  of the division
        dimes=(int)(cost$*10)%10; // get dimes amount
        pennies=(int)(cost$*100)%10;// get pennies amount 
        System.out.println("The total cost of " +nBigMacs
         +" Big Macs, at $"+bigMac$ +" per bigMac, with a" + " " + 
         "sales tax of "+ (int)(taxRate*100) + " %, is $"+dollars+'.'+dimes+pennies); 
                 // output the total cost using the dollars, 
                //dimes and pennies amount in the print statemnt to show in the form $X.XX


    }
}//end public class