// Marc Laflamme
//CSE2 Lab 2
// January 30th 2015
// create a cyclometer program to measure speed, distance, etc.
// make class
public class Cyclometer {
    //create main method
    public static void main(String[] args) {
        // our input data
	   	int secsTrip1=480;  //seconds for the first trip
       	int secsTrip2=3220;  //seconds for the second trip 
		int countsTrip1=1561;  // # of rotations occuring during the first trip
		int countsTrip2=9037; // # of rotations occuring during the second trip
	
		// our intermediate variables and output data. 
    
        double wheelDiameter=27.0,  // measurment of wheel diameter
  	     PI=3.14159, // approximation of pi
    	 feetPerMile=5280,  // number of feet in a mile
    	 inchesPerFoot=12,   // # of inches in a foot conversion
    	 secondsPerMinute=60;  // # of seconds in a minute conversion
    	double distanceTrip1, distanceTrip2,totalDistance;  //recording doubles 
    	// for the first two distances and their total sum
    
        // create statments to print the results with context
    	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts."); // print out time and count information for trip 1
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts."); // print out time and count information for trip 2
       distanceTrip1=countsTrip1*wheelDiameter*PI; // calculate distance 1 using the number 
        //of rotations times the diameter times pi
    	// Above gives distance in inches
    	distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // calculates
	    //the same thing as for distance 1, but takes care of converting to miles as well
	    totalDistance=distanceTrip1+distanceTrip2; //sum of the two distances
	    System.out.println("Trip 1 was "+distanceTrip1+" miles"); // display the distance covered in trip 1 in miles
	    System.out.println("Trip 2 was "+distanceTrip2+" miles"); // display the distance covered in trip 2 in miles
	    System.out.println("The total distance was "+totalDistance+" miles"); // display total distance covered
	    //in miles



    }
}