// Marc Laflamme CSE2 homework 11
//  April 13th, 2015
// Create a program that takes in 15 inputs for students grades,
// print error messages accordingly
// and scramble the sorted array randomly
// use both a linear and binary search to find a given value


import java.util.Scanner; //import scanner

public class CSE2Linear {
    public static void main(String[] args) {
		double y=0; //declare double values y and z 
        double z=0;
        boolean a;// use 3 boolean values to check/ define the possible errors in the following statements
        boolean b;
        boolean c;
        int[] intArray; //declare main array
        int[] secondIntArray; //declare altered array
    	int x=0;
        int maxval=0; // max value for the array
        int intputNumInt=0; // declare input number as an integer
        double inputNumber=0; //declare same input number as a double
        intArray = new int[15]; //array wiht length 15
        secondIntArray = new int[15]; // second int with length 15
        Scanner inputScanner = new Scanner(System.in);
   
   		// take in 15 values in the range 0 to 100
        for ( x = 0; x <= 14; x++) {
            y = -1;
            if (x >= 1){
                y = intArray [x - 1];   
            }
            a = false; // set all boolean false 
            b = false;
            c = false;
            System.out.print("Enter an integer between 0 and 100 inclusive: ");
            inputNumber = inputScanner.nextDouble();
            
            // check if given value in an integr; ask for new input if false
            while (a == false || b == false || c == false){
                if (inputNumber % 1 == 0){
                    a = true; 
                }
                else{
                    System.out.print("Error. Not an integer, enter a new value: ");
                    inputNumber = inputScanner.nextDouble();
                    a = false;
                    b = false;
                    c = false;
                    continue;
                }
                // check if given value is between 0 and 100 inclusive; ask for new input if false
                if (inputNumber <= 100 && inputNumber >= 0){
                    b = true;
                }
                else{
                    System.out.print("Error. Not in the range, enter a new value ");
                    inputNumber = inputScanner.nextDouble();
                    a = false;
                    b = false;
                    c = false;
                    continue;
                }
                // check if given value is larger than or equal to previous value; ask for new input if false
                if (inputNumber >= y){
                    c = true;
                }
                else{
                    System.out.print("Error. Enter and integer greater than the previous. ");
                    inputNumber = inputScanner.nextDouble();
                    a = false;
                    b = false;
                    c = false;
                    continue;
                }
            }
            
            intputNumInt = (int) inputNumber; 
            intArray[x] = intputNumInt;
        
            if (intArray[x] >= maxval){
                maxval = intArray[x];
            }
        }
        
        System.out.println(" ");
        System.out.print("Array: "); //print out initial array ^
        for (x = 0; x <= 14; x++){
            System.out.print(intArray[x]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        binarySearch(intArray, maxval); // call binary search method
        secondIntArray = randomizer(intArray); // call randomizer method
        System.out.println(" ");
        System.out.print("Array after randomizer: ");
        for (x = 0; x <= 14; x++){
            System.out.print(secondIntArray[x]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        //print out the randomized array

        linearSearch(secondIntArray); // linear search the randomized array
       
        
        
    }
    // declare binary search method
	public static void binarySearch(int[] intArray, int maximum) {
		int position;
		int upperbound=15;// upper bound of array
		int lowerbound=0;// lower bound of array
		int key=0; // search key =0
		int comparisonCount = 1; // number of iterations it takes to find value
		Scanner binaryScanner = new Scanner(System.in);
		
		System.out.print("Search for value: "); // take in value to scan for
		key = binaryScanner.nextInt();
		
		while (key > maximum){
		    System.out.print("Too high, pick a new number: ");
		    key = binaryScanner.nextInt();
		    // pick number within range
		}
		while (key <= 0){
		    System.out.print("Pick a positive number: ");
		    key = binaryScanner.nextInt();
		    //pick number within range
		}

		position = (lowerbound + upperbound) / 2; // halve the search field and adjust bound values
		position = (int) position;
		
		//chech the values in the new halved array
		while ((intArray[position] != key) && (lowerbound <= upperbound)) {
			if (intArray[position] > key) {
				upperbound = position - 1;
			} 
			else {
				lowerbound = position + 1; 
			}
			position = (lowerbound + upperbound) / 2;// halve the range again
			position = (int) position;
			comparisonCount++;// increment interations
		}
		
		// print search info for binary method
		if (lowerbound <= upperbound) {
			System.out.println("The number was found in array with subscript " + (position + 1));
			System.out.println("The binary search found the number after " + comparisonCount + " iterations.");
		} 
    	else {
			System.out.println("The number is not in this array.  The binary search made " + comparisonCount + " iterations.");
		}
	}
	
	
	//randomizer method
	 public static int[] randomizer(int[] randArray) {
        
		for (int i = 0; i < 15; i++) {
			int target = (int)(15 * Math.random());
			int temp = randArray[target];
			randArray[target] = randArray[i];
			randArray[i] = temp;
			//shuffle the positiion numbers of the intitial array to define the second array
		}
    	return randArray; // return randomized array
	}
	// define linear search method
		public static void linearSearch(int[] intArray) {
		int search;
		int iterations = 0;// number of checks it takes to find the given number
		Scanner linearScanner = new Scanner(System.in);
		System.out.print("Enter value to find: ");
		search = linearScanner.nextInt();
		for (int c = 0; c <= 14; c++) { // check the componenets of the array in shuffled order
		    iterations++;// increment iterations up  for each check
			if (intArray[c] == search){
				System.out.println("Your searched number " + search + " is present at location " + (c + 1) + ".");
				System.out.println("The search required " + iterations + " iterations.");
				break;
				// print position and iterations it took
			}
		    if (c==14) {
		        System.out.println(search + " is not in the array."); // error if the number isnt part of the array
		    }
		}
	}
	
}