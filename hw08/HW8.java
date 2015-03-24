// Marc Laflamme 
// Hw08, March 24th 2015, CSE 2
// Code a game that walks the player through an aadventure in a cave,
//meeting and fughting a giant, and getting a reward.
// the outcome of the game is impacted by the inputs taken from the player.

import java.lang.Math; // import math functions

import java.util.Scanner; //import scanner class

public class HW8{
    public static void main(String[] args) {
        char option; // initialize char option
        Scanner scan = new Scanner(System.in); // take in scanner variable
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit:"); // prompt option to continue
        getInput(scan, "Cc"); //getInput method
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit:"); // prompt option to continue
        getInput(scan, "Cc"); //getInput method
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();// cave method
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit: "); // prompt option to continue
        getInput(scan, "Cc"); // getInput method
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit:"); // prompt option to continue
        getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant(); //giant method
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        // prompt option to continue attack or escape
        getInput(scan, "AaEe", 10); //getInput method
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!"); // You won message
        System.out.println("There are three 3 treasure box in front of you! Enter the box number you want to open!");
        // prompt for box choice
        box(); // box method
        getInput(scan); // getInput method
        System.out.println("Hero! Have a good day!"); // print end congrats line
    }
    
    // draw the giant
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ         ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ         ");
        System.out.println("                           H    HHHHHHHHHHH    H              ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ         ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                  ");
    }
   
    // drave the cave
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *         ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //draw the 3 prize boxes
    public static void box(){
        System.out.println("                     *********************     *********************    *********************              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************              "); 
    }
    
    public static void getInput(Scanner scan, String string){ //getInput method
        String stringScan = scan.next();
       if (stringScan.charAt(0) == 'c' || stringScan.charAt(0) == 'C'){}

        else{
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
    }
    
    public static void getInput(Scanner scan, String string, int trial){ //getInput method
        double randomNum;
        while (trial>0){
            String stringScan = scan.next();
            if (stringScan.charAt(0) == 'A' || stringScan.charAt(0) == 'a'){ 
                // if input = a or A continue
                randomNum = Math.random(); // initialize random number
                if (randomNum < 0.5){
                    // if = 0 then its a miss; ask again
                    randomNum=0;
                    System.out.println("Miss!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                }
                else {
                    randomNum = 1;
                    // if =1, then critical hit; ask again
                    System.out.println("Critical Hit!");
                    trial--; // increment to 10
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                }
            }
            else if (stringScan.charAt(0) == 'E' || stringScan.charAt(0) == 'e'){
                // if input = e or E
                randomNum = Math.random(); //initialize random number
                if (randomNum >= 0.90){
                    // if random number between 0 and 1 is gtreater than .90 ==> 10% escape rate
                    System.out.println("You've successfully escaped!");
                    
                    return; // return
                }
                else{ 
                    System.out.println("YOU DIDN'T ESCAPE!!!!!!");
                    // 90% chance for no escape, then ask again
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD"); 
                }
            }
            else{
                System.out.println("Executed by the GIANT! GAME OVER "); // print game over message
                System.exit(0); //exit program
            }
        }
    }
    public static void getInput(Scanner scan){ //getInput method
        int stringScan = scan.nextInt(); // take integer input
        switch(stringScan) { // make switch statement with 3 possible rewards
            case 1:
                 System.out.println("Congrats! You have won a $100 Amazon gift card.");
                 break;
            case 2:
                 System.out.println("Congrats! You have won omniscience.");
                 break;
            case 3:
                 System.out.println("Congrats! You get a cookie!");
                 break;
            default:
            System.out.println("Wrong number! You get nothing!"); // print message of getting nothing if 1-3 isn't entered
        }
    }
}