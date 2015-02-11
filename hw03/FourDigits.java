//Marc Laflamme
//HW 3 
// Program 2: FourDigits
// February 8th 2015
// create a program to display the first 4 numbers that come after the decimal
//point of a given double
//
import java.util.Scanner; //import scanner class
// make class
 public class FourDigits {
     // main method
     public static void main(String[] args){
       
        Scanner myScanner; //declare scanner
        myScanner= new Scanner (System.in); // setup variable input
        System.out.print("Enter a double :");
         // prompt the user to give a double^
        double givenDouble= myScanner.nextDouble(); //accept user input
        int givenInt=(int)givenDouble; //create an integer value of the given double
        givenDouble=givenDouble*10000; // multiply given double by 10000 (double)
        givenInt=givenInt*(int)10000; // multiply given int value by 10000 (integer)
        int doubleToInt=(int)givenDouble; //create a second int that takes the value 
        //of the given double times 10000
        int resultingDigits= doubleToInt-givenInt;// make a final int that holds
        //the value of the four digits
        System.out.println("The four digits are: " + resultingDigits); 
        //print the four digits
     }
 }
        
        
        