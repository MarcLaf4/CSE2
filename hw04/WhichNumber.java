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
         System.out.println("For the following questions, answer 1 for yes and 2 for no.");
         //use 1 to represent yes and 2 to represent no
         System.out.println("Think of a number between 1 and 10 inclusive");
              //prompt the user to think of a number
         System.out.print("Is the number even? ");
              //ask if the number is even
        int oddOrEven = myScanner.nextInt();//accept user input
        System.out.print("Is the number divisible by 3? ");
              //ask if the number is divisible by 3
        int divisible3 = myScanner.nextInt();//accept user input
        System.out.print("Is the number divisible by 4? ");
              //ask if the number is divisible by 4
        int divisible4 = myScanner.nextInt();//accept user input
        System.out.print("Is the number divisible by 5? ");
              //ask if the number is divisible by 5
        int divisible5 = myScanner.nextInt();//accept user input
        System.out.print("Is the number divided by 4 greater than 1? ");
              //ask if the remainder of the number/4 is greater than 1
        int remainder4 = myScanner.nextInt();//accept user input
        System.out.print("Is the number divided by 3 greater than 1? ");
          //ask if the number is divisible by 3
        int remainder3 = myScanner.nextInt();//accept user input
        System.out.print("Is the number greater than 6? ");
              //ask if the number is greater than 6
        int greaterThan6 = myScanner.nextInt();//accept user input
        System.out.print("Is the number less than 3? ");
              //ask if the number is less than 3
        int lessThan3 = myScanner.nextInt();//accept user input
        
        
        // first path is for even number possibilities
        
        if(oddOrEven== 1){
            if(divisible3 == 1){
                System.out.println("Your number is 6."); // result is 6
            }
            else if (divisible3 == 2){
                if(divisible4 == 1){
                    if(remainder4 == 1){
                        System.out.println("Your number is 8."); // result is 8
                    }
                    else if(remainder4 == 2){
                        System.out.println("Your number is 4."); //result is 4
                    }
                }
                else if (divisible4 == 2){
                    if(divisible5== 1){
                        System.out.println("Your number is 10.");//result is 10
                    }
                    else if(divisible5 == 2){
                        System.out.println("Your number is 2."); //reult is 2
                    }
                }
            }
        }
            //second path is for odd number possibilities
            
            else if(oddOrEven== 2){
            if (divisible3 == 2){
                if(greaterThan6 == 1){
                     System.out.println("Your number is 7."); // result is 7
                }
                else if(greaterThan6 == 2){
                    if(lessThan3==2) {
                        System.out.println("Your number is 5.");// result is 5
                     }
                    else if (lessThan3 == 1){
                        System.out.println("Your number is 1."); //result is 1
                    }
                }
            }
            else if (divisible3 == 1){
                if(remainder3 == 1){
                    System.out.println("Your number is 9."); //result is 9
                }
                else if (remainder3 == 2) {
                    System.out.println("Your number is 3."); // result is 3
                }
            }
       
        
            }   
            else {
                System.out.println("Your input is not consistent.");// if none of the above possiblities happen, 
                //input is invalid
            }
        
        
    }// end main
} //end class
    