//Marc Laflamme
//HW 3 
// Program 2: Root
// February 8th 2015
// create a program to take the cubed root of a given number, 
// and return the cubed result of that estimated result
//
import java.util.Scanner; //import scanner class
import java.lang.Math; // import math utilities
// make class
 public class Root {
     // main method
     public static void main(String[] args){
       
        Scanner myScanner; //declare scanner
        myScanner= new Scanner (System.in); // setup variable input
        System.out.print("Enter any number :");
         // prompt the time in seconds as an integer value ^
        double givenCube= myScanner.nextDouble(); //accept user input
        double cubedRoot=Math.pow(givenCube,.33333333); //take the cubed root of 
        //the given number
        double cubedResult=Math.pow(cubedRoot,3); //cube the result
        System.out.println("The cubed root is: " + cubedRoot + ":"); 
        //print out root ^
        System.out.println(cubedRoot+" * "+cubedRoot+" * "+cubedRoot+" = " + cubedResult);
        //take the given cubed root and multiply out to show the approximated result
     }
 }