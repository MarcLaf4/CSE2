// Marc Laflamme 
// Homework 04 Which Number, February 14th 2015, CSE 2
// Write a program that takes the users input to determine which number
// from 1-10 they are thinking of by utilizing yes or no responses
//
import java.util.Scanner; //import scanner class
//set up class
public class WhichNumber{
    //make main method
   
    
    public static void main(String[] args){
        Scanner myScanner;//declare scanner
        myScanner= new Scanner (System.in); // setup variable input
         System.out.println("For the following questions, answer y for yes and n for no.");
         System.out.println("Think of a number between 1 and 10 inclusive");
              //prompt the user to think of a number
         System.out.print("Is the number even?");
              //ask if the number is even
        String oddOrEven = myScanner.next();//accept user input
        System.out.print("Is the number divisible by 3?");
              //ask if the number is divisible by 3
        String divisible3 = myScanner.next();//accept user input
        System.out.print("Is the number divisible by 4?");
              //ask if the number is divisible by 4
        String divisible4 = myScanner.next();//accept user input
        System.out.print("Is the number divisible by 5?");
              //ask if the number is divisible by 5
        String divisible5 = myScanner.next();//accept user input
        System.out.print("Is the number divided by 4 greater than 1?");
              //ask if the remainder of the number/4 is greater than 1
        String remainder4 = myScanner.next();//accept user input
        System.out.print("Is the number divided by 3 greater than 1?");
          //ask if the number is divisible by 3
        String remainder3 = myScanner.next();//accept user input
        System.out.print("Is the number greater than 6?");
              //ask if the number is greater than 6
        String greaterThan6 = myScanner.next();//accept user input
        System.out.print("Is the number less than 3?");
              //ask if the number is less than 3
        String lessThan3 = myScanner.next();//accept user input
        
        
        if(oddOrEven== "y"){
            if(divisible3 == "y"){
                System.out.println("Your number is 6.");
            }
            else if (divisible3 == "n"){
                if(divisible4 == "y"){
                    if(remainder4 == "y"){
                        System.out.println("Your number is 8.");
                    }
                    else if(remainder4 == "n"){
                        System.out.println("Your number is 4.");
                    }
                }
                else if (divisible4 == "n"){
                    if(divisible5== "y"){
                        System.out.println("Your number is 10.");
                    }
                    else if(divisible5 == "n"){
                        System.out.println("Your number is 2.");
                    }
                }
            }
        }
            else if(oddOrEven== "n"){
            if (divisible3 == "n"){
                if(greaterThan6 == "y"){
                     System.out.println("Your number is 7.");
                }
                else if(greaterThan6 == "n"){
                    if(lessThan3=="n") {
                        System.out.println("Your number is 5.");
                     }
                    else if (lessThan3 == "y"){
                        System.out.println("Your number is 1.");
                    }
                }
            }
            else if (divisible3 == "y"){
                if(remainder3 == "y"){
                    System.out.println("Your number is 9.");
                }
                else if (remainder3 == "n") {
                    System.out.println("Your number is 3.");
                }
            }
       
                    
                   
            
            

        
            }   
            else {
                System.out.println("Your input is not consistent.");
            }
        
        
    }
}
    