// Marc Laflamme 
// Hw04 ToHex, February 22th 2015, CSE 2
// write a program that converts the decimal representation of the color
//composition of pixels to hexadecimal XXYYZZ
//import java.util.Scanner; //import scanner class
//set up class
import java.util.Scanner;
public class ToHex{
    //make main method
    public static void main(String[] args) {
        
        Scanner myScanner; //declare scanner
        myScanner= new Scanner (System.in); // setup variable input
        System.out.print("Enter the red decimal value as an integer: ");
        int decimalNumber1=myScanner.nextInt(); // accept user input
        System.out.print("Enter the green decimal value as an integer: ");
        int decimalNumber2=myScanner.nextInt(); // accept user input
        System.out.print("Enter the blue decimal value as an integer: ");
        int decimalNumber3=myScanner.nextInt(); // accept user input
        
        int caseNumber1 = decimalNumber1%16; // establish variable to use in switch 
        // statemnt by modding the given int with 16
        int redDiv = decimalNumber1/16; // given number/16
        
        int caseNumber2 = decimalNumber2%16;// establish variable to use in switch 
        // statemnt by modding the given int with 16
        int greenDiv = decimalNumber2/16; // given number/16
        
        int caseNumber3 = decimalNumber3%16;// establish variable to use in switch 
        // statemnt by modding the given int with 16
        int blueDiv = decimalNumber3/16; // given number/16
        
        //The following 6 lines simply convert the values to string for the sake 
        //sake of assigning chars and printing at the end
         String numberString1= String.valueOf(decimalNumber1);
         String numberString2= String.valueOf(redDiv);
        
         String numberString3= String.valueOf(decimalNumber2);
         String numberString4= String.valueOf(greenDiv);
        
         String numberString5= String.valueOf(decimalNumber3);
         String numberString6= String.valueOf(blueDiv);
         
         
         
         // switch statement asigns hex value 0-F given the red number given the 
         //modulus function 
        switch (caseNumber1) {
        case 15:
            numberString1="F";
        break;
        case 14:
            numberString1="E";
        break;
        case 13:
            numberString1="D";
        break;
        case 12:
            numberString1="C";
        break;
        case 11:
            numberString1="B";
        break;
        case 10:
            numberString1="A";
        break;
        case 9:
            numberString1="9";
        break;
        case 8:
            numberString1="8";
        break;
        case 7:
            numberString1="7";
        break;
        case 6:
            numberString1="6";
        break;
        case 5:
            numberString1="5";
        break;
        case 4:
            numberString1="4";
        break;
        case 3:
            numberString1="3";
        break;
        case 2:
            numberString1="2";
        break;
        case 1:
            numberString1="1";
        break;
        case 0:
            numberString1="0";
        break;
        default: System.out.println("You did not enter a proper int.");
                //error if not an int from 0-255
    }
    
    // this switch statement assigns the second hex value for red given the whole 
    // number truncated by the division by 16
    switch (redDiv) {
        case 15:
            numberString2="F";
        break;
        case 14:
            numberString2="E";
        break;
        case 13:
            numberString2="D";
        break;
        case 12:
            numberString2="C";
        break;
        case 11:
            numberString2="B";
        break;
        case 10:
            numberString2="A";
        break;
        case 9:
            numberString2="9";
        break;
        case 8:
            numberString2="8";
        break;
        case 7:
            numberString2="7";
        break;
        case 6:
            numberString2="6";
        break;
        case 5:
            numberString2="5";
        break;
        case 4:
            numberString2="4";
        break;
        case 3:
            numberString2="3";
        break;
        case 2:
            numberString2="2";
        break;
        case 1:
            numberString2="1";
        break;
        case 0:
            numberString2="0";
        break;
        default: System.out.print("You did not enter a proper int.");
                //error if not an int from 0-255
    }
   
    // switch statement asigns hex value 0-F given the green number given the 
         //modulus function 
    switch (caseNumber2) {
        case 15:
            numberString3="F";
        break;
        case 14:
            numberString3="E";
        break;
        case 13:
            numberString3="D";
        break;
        case 12:
            numberString3="C";
        break;
        case 11:
            numberString3="B";
        break;
        case 10:
            numberString3="A";
        break;
        case 9:
            numberString3="9";
        break;
        case 8:
            numberString3="8";
        break;
        case 7:
            numberString3="7";
        break;
        case 6:
            numberString3="6";
        break;
        case 5:
            numberString3="5";
        break;
        case 4:
            numberString3="4";
        break;
        case 3:
            numberString3="3";
        break;
        case 2:
            numberString3="2";
        break;
        case 1:
            numberString3="1";
        break;
        case 0:
            numberString3="0";
        break;
        default: System.out.println("You did not enter a proper int."); 
        //error if not an int from 0-255
    }
     // this switch statement assigns the second hex value for green given the whole 
    // number truncated by the division by 16
    switch (greenDiv) {
        case 15:
            numberString4="F";
        break;
        case 14:
            numberString4="E";
        break;
        case 13:
            numberString4="D";
        break;
        case 12:
            numberString4="C";
        break;
        case 11:
            numberString4="B";
        break;
        case 10:
            numberString4="A";
        break;
        case 9:
            numberString4="9";
        break;
        case 8:
            numberString4="8";
        break;
        case 7:
            numberString4="7";
        break;
        case 6:
            numberString4="6";
        break;
        case 5:
            numberString4="5";
        break;
        case 4:
            numberString4="4";
        break;
        case 3:
            numberString4="3";
        break;
        case 2:
            numberString4="2";
        break;
        case 1:
            numberString4="1";
        break;
        case 0:
            numberString4="0";
        break;
        default: System.out.println("You did not enter a proper int.");
                //error if not an int from 0-255
    }
    
    // switch statement asigns hex value 0-F given the blue number given the 
     //modulus function 
   
    switch (caseNumber3) {
        case 15:
            numberString5="F";
        break;
        case 14:
            numberString5="E";
        break;
        case 13:
            numberString5="D";
        break;
        case 12:
            numberString5="C";
        break;
        case 11:
            numberString5="B";
        break;
        case 10:
            numberString5="A";
        break;
        case 9:
            numberString5="9";
        break;
        case 8:
            numberString5="8";
        break;
        case 7:
            numberString5="7";
        break;
        case 6:
            numberString5="6";
        break;
        case 5:
            numberString5="5";
        break;
        case 4:
            numberString5="4";
        break;
        case 3:
            numberString5="3";
        break;
        case 2:
            numberString5="2";
        break;
        case 1:
            numberString5="1";
        break;
        case 0:
            numberString5="0";
        break;
       default: System.out.println("You did not enter a proper int.");
               //error if not an int from 0-255
    }
    
     // this switch statement assigns the second hex value for blue given the whole 
    // number truncated by the division by 16
    switch (blueDiv) {
        case 15:
            numberString6="F";
        break;
        case 14:
            numberString6="E";
        break;
        case 13:
            numberString6="D";
        break;
        case 12:
            numberString6="C";
        break;
        case 11:
            numberString6="B";
        break;
        case 10:
            numberString6="A";
        break;
        case 9:
            numberString6="9";
        break;
        case 8:
            numberString6="8";
        break;
        case 7:
            numberString6="7";
        break;
        case 6:
            numberString6="6";
        break;
        case 5:
            numberString6="5";
        break;
        case 4:
            numberString6="4";
        break;
        case 3:
            numberString6="3";
        break;
        case 2:
            numberString6="2";
        break;
        case 1:
            numberString6="1";
        break;
        case 0:
            numberString6="0";
        break;
        default: System.out.println("You did not enter a proper int.");
                //error if not an int from 0-255
    }
   
    System.out.println(numberString2+numberString1+numberString4+numberString3+numberString6+numberString5);
    //print out the sex digit hex number in the for RRGGBB
    }
}


