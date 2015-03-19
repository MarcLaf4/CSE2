//Marc Laflamme
// CSE2 HW 7 Waves.java
// March 15 2015
// Write a program that uses for, while, and do-while loops to create 
// 3 sequences/pyramids of numbers based on a number taken as input 
// between 1 and 30 inclusive

import java.util.Scanner; // import scanner class

public class waves{
   
    public static void main (String [ ] args){
        Scanner myScanner = new Scanner (System.in); // declare scanner
        
        //declare counters to use for rows, indentation, and given number 
        int counter1 = 1; 
        int counter2 = 1;
        int counter3 = 1;
        
        System.out.print("Enter a number between 1 and 30: ");
        int inputNumber = myScanner.nextInt();
        // take input for number 1 and 30 as int
       
        
        System.out.println("");
        System.out.println("FOR LOOP:");
        // label for loop
        
        for (counter1= 1; counter1 <= inputNumber; counter1 += 2){
            for (counter2 = counter1; counter2 >= 1; counter2--){
                for (counter3 = 1; counter3 <= counter2; counter3++){
                    System.out.print(counter1); //make it so that it counts up to the amount that the given number is
                }
                System.out.println(""); //spacing
            }
            if ((counter1 + 1) <= inputNumber){
                for (counter2 = 1; counter2 <= (counter1 + 1); counter2++){
                    for (counter3 = 1; counter3 <= counter2; counter3++){
                        System.out.print((counter1+ 1));
                        // display the seconf end of the pattern with the same method but reversed
                    }
                    System.out.println("");
                 }
             }
         }
          
       
        
        System.out.println("");
       
        System.out.println("WHILE LOOP:");// label while loop
        
         //declare counters to use for rows, indentation, and given number 
        counter1 = 1;
        counter2= 1;
        counter3 = 1;
         
        while (counter1 <= inputNumber){
            counter2 = counter1;
            while (counter2 >= 1){
                counter3 = 1;
                while (counter3<= counter2){
                    System.out.print(counter1);
                    counter3 = counter3+ 1;// increment 3 up by 1
                }
                //make it so that it counts up to the amount that the given number is
                System.out.println("");
                counter2 = counter2 - 1;// increment 2 down by 1
            }
            if ((counter1 + 1) <= inputNumber){
                counter2 = 1;
                while (counter2 <= (counter1 + 1)){
                    counter3= 1; // reassign 3 as 1
                    while (counter3 <= counter2){
                        System.out.print((counter1 + 1));
                        counter3= counter3 + 1;// increment 3 up by 1
                    }
                    System.out.println(""); // add spacing
                    counter2 = counter2 + 1; // increment 2 up by 1
                }
            }
            counter1 = counter1 + 2;// inrement 1 up by 2
        }
        
         //declare counters to use for rows, indentation, and given number 
        counter1 = 1;
        counter2 = 1;
        counter3 = 1;
        
        System.out.println("");
        System.out.println("DO-WHILE LOOP:"); //label do while
        
        do {
            counter2 = counter1;
           
            do {
                counter3 = 1;// declare/reassign third counter again
              
                do{
                  
                    System.out.print(counter1);
                    counter3 = counter3 + 1; // increment
                } while (counter3 <= counter2);// end do while
                System.out.println("");// spacing 
                counter2 = counter2- 1; // increment 2 down
            } while (counter2 >= 1);//end do while
            if ((counter1 + 1) <= inputNumber){
                counter2 = 1; //reassign counter2
                //make it so that it counts up to the amount that the given number is
                do {
                    counter3 = 1;// reassign counter3
                    do {
                        System.out.print(counter1 + 1); // print number
                        counter3 = counter3 + 1;
                    } while (counter3 <= counter2);
                    System.out.println("");
                    counter2 = counter2 + 1;
                } while (counter2 <= (counter1 + 1)); // while paremeter
                 // display the second end of the pattern with the same method but reversed
            }
            counter1 = counter1 + 2;
        } while (counter1 <= inputNumber); // end do-while /parameters
    }
} // end class