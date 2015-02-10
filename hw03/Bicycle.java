//Marc Laflamme
//HW 3 
// Program 1: Bicycle
// February 8th 2015
// create a program to take the input for number of cycles
// and for amount of time (in seconds) that they took to occur
//
import java.util.Scanner; //import scanner class
// make class
 public class Bicycle {
     // main method
     public static void main(String[] args){
       
        Scanner myScanner; //declare scanner
        myScanner= new Scanner (System.in); // setup variable input
        System.out.print("Enter the time in seconds :");
         // prompt the time in seconds as an integer value ^
        int nBikeSeconds= myScanner.nextInt(); //accept user input
        System.out.print("Enter the number of counts from the cyclometer :");
        // prompt number of counts as an integer value ^
         int nBikeCounts = myScanner.nextInt(); //accept user input
        
         // our intermediate variables and output data: 
        double wheelDiameter=27.0,  // measurment of wheel diameter in inches
  	     PI=3.14159, // approximation of pi
    	 feetPerMile=5280,  // number of feet in a mile
    	 inchesPerFoot=12,   // # of inches in a foot conversion
    	 secondsPerMinute=60, // # of seconds in a minute conversion
    	 minutesPerHour=60; // # of minutes in an hour
    	 
    	 double totalDistance= (wheelDiameter*PI*nBikeCounts);
    	 // record total distance 
    	 totalDistance/=inchesPerFoot*feetPerMile;
    	 //convert to miles
    	 double timeInMinutes= nBikeSeconds/secondsPerMinute; 
    	 // convert seconds --> minutes
    	 double averageSpeed=totalDistance/(timeInMinutes/minutesPerHour);
    	 // record average speed in mph
    	 
    	 //convert the results to display reasonable numbers by converting to integers:
            totalDistance= 100*totalDistance; //multiply by 100
            timeInMinutes=100*timeInMinutes; //multiply by 100
            averageSpeed=100*averageSpeed;// multiply by 100
          	 
            totalDistance= (int)totalDistance; // convert to integer
          	 timeInMinutes=(int)timeInMinutes;//convert to integer
          	 averageSpeed=(int)averageSpeed; //convert to integer
          	 
          	 totalDistance= totalDistance/100.0; // divide by 100.0
          	 timeInMinutes=timeInMinutes/100.0;//divide by 100.0
          	 averageSpeed=averageSpeed/100.0; //divide by 100.0
    	 
    	 System.out.println("The total distance convered was "+ totalDistance + " miles");
    	 // print out total distance
    	 System.out.println("The total time it took was " + timeInMinutes + " minutes");
    	 // print out total time in minutes
    	 System.out.println("The average speed was " + averageSpeed + " mph");
    	 // print out average speed in mph
    	 
    	 
    	 
    	 
    	 
     }
 }