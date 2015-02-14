// Marc Laflamme 
// Lab 04 Cookies, February 13th 2015, CSE 2
// Write a program that uses the Scanner class to obtain from users how many 
//cookies they want, how many people they are buying for, and at least how many 
//cookies they want each person to get. Make sure all inputs are valid.
//Then determine if the number of cookies is evenly divisible among the people 
//and if there is enough for each person. If there are not enough cookies tell
//the user how many more are need.
//
import java.util.Scanner; //import scanner class
//set up class
public class Cookies{
    //make main method
   
    
    public static void main(String[] args){
        int nPeople; //intialize variable for number of people
        int nCookies; // initialize variable for number of cookies bought
        int nCookiesPerPerson;  // intitialize variable for cookies per person
        Scanner myScanner;//declare scanner
        myScanner= new Scanner (System.in); // setup variable input
 
         System.out.print("Enter the number of people: ");
              //prompt input for number of people ^
               if(myScanner.hasNextInt()) {
            nPeople = myScanner.nextInt();//accept user input
            if( nPeople<0) {
            System.out.println("You did not enter an int greater than 0");
            // if the integer is negative, stop
            return;    //leaves the program, i.e.
                //the program terminates
            } 
             
       }
         
         
        else {
          System.out.println("You did not enter an int"); 
          // print notification that user didnt enter a proper integer
            return;    //leaves the program, i.e.
                //the program terminates

        
        }
               
      
         System.out.print("Enter the number of cookies you are planning to buy: ");
              //prompt input for number of cookies to be bought ^
               if(myScanner.hasNextInt()) {
         nCookies = myScanner.nextInt();//accept user input
         if( nCookies<0) {
            System.out.println("You did not enter an int greater than 0");
               // if the integer is negative, stop
            return;    //leaves the program, i.e.
                //the program terminates
               }
              
        }
               
            
       else {
          System.out.println("You did not enter an int ");
          // print notification that user didnt enter a proper integer
            return;    //leaves the program, i.e.
                //the program terminates
}

       
     
         System.out.print("How many cookies per person?: ");
              //prompt input for number of cookies each person gets ^
             if(myScanner.hasNextInt()) {  
        nCookiesPerPerson = myScanner.nextInt(); //accept user input
        if( nCookiesPerPerson<0) {
            System.out.println("You did not enter an int greater than 0");
               // if the integer is negative, stop
            return;    //leaves the program, i.e.
                //the program terminates
                }
              
             }
                 
             
        else {
          System.out.println("You did not enter an int ");
          // print notification that user didnt enter a proper integer
            return;    //leaves the program, i.e.
                //the program terminates
        }
   
    
    if ((nCookiesPerPerson*nPeople)<=nCookies){
        // check if there will be enough cookies for everyone
        if(nCookies%nPeople == 0){
          System.out.println("You have enough cookies for each person and the amount will divide evenly.");
          // if there is no remainder, then the cookies divide evenly
        }
        else {
         System.out.println("You have enough, but the amount will not divide evenly.");
         //if there is a remainder, the cookies dont divide evenly
        }
     }
     else{
         int cookiesNeeded=(nCookiesPerPerson*nPeople)-nCookies; // the extra cookies needed is equal to
         //the demand minus the current number of cookies
         System.out.println("You will not have enough cookies. You will need at least "+ cookiesNeeded + " more.");
         // print out the number of cookies needed
        }//end main method
    }//end class
}
