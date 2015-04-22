/* Marc Laflamme
CSE 2 Homework 12 April 21 2015
implementing matrix multiplication 
*/ 
import java.util.Scanner; // import scanner class
import java.util.Random; // import random calss

public class Multiply{

	public static void main(String[] args){ // main method
		
	 Scanner myScanner = new Scanner(System.in);
         // setup booleans to chekc for errors in the following code
        boolean x=false;
        boolean y=false;
        boolean z=false;
        boolean p=false;
        
        System.out.print("What is the integer width: "); // ask for int width
       double widthInput = myScanner.nextDouble();
        
        while (x == false||y == false){
            if (widthInput % 1 == 0){
                
                x=true;
            }
              else {
                x = false;
                y = false;
                System.out.print("Error, enter an integer: "); // check if width is an int
                 widthInput = myScanner.nextDouble();
            }
            if (widthInput>0){
                y = true;
            }
            else{
                x = false;
                y = false;
                System.out.print("Error, enter a positive integer: "); // check if width is positive
                widthInput = myScanner.nextDouble();
            }
        }
        
        System.out.print("What is the integer height: "); // ask for height int
       double heightInput = myScanner.nextDouble();
        
        while (z == false||p == false){
            if (heightInput % 1 == 0){
                z = true;
            }
            else {
                z = false;
                p = false;
                System.out.print("Error, enter an integer: "); // check if height is an int
                heightInput = myScanner.nextDouble();
            }
            if (heightInput > 0){
                p = true;
            }
            else{
                z = false;
                p = false;
                System.out.print("Enter a positive integer: "); // check if height is a postive int
                heightInput = myScanner.nextDouble();
            }
        }
    
    int width= (int) widthInput; // convert double width and height to int width and height
    int height= (int)heightInput;
    
     // Create two matrices as two dimensional arrays
		int[][] matrix1 = new int[height][width]; // first matrix with width x height dimesnions
		int[][] matrix2 = new int[height][width]; // secondvmatrix with width x height dimesnions
		

    // create the random values to fill in the matrices
		for (int i = 0; i < matrix1.length; i++)
			for (int j = 0; j < matrix1[i].length; j++) 
			{
				matrix1[i][j] = (int)(Math.random() * 20-10); // random int from -10 to 10
				matrix2[i][j] = (int)(Math.random() * 20-10); // random int from -10 to 10
			}
	
	
		
		// Multiply two matrices and print the result
		int [][] resultMatrix = multiplyMatrix(matrix1, matrix2); // assign and print the product matrix
		System.out.println("\n The product matrix is: ");
		printResult2( resultMatrix, height, width);
	}
	
	
	
	

	// method for multiplying the matrices
	public static int[][] multiplyMatrix(int[][] productMatrix, int[][] productMatrix2) 
	{
	    // take in the two random matrices and assign thier matrix product to a new product matrix
		int[][] resultM = new int[productMatrix.length][productMatrix2[0].length]; // create value for each value per column and row
		for (int i = 0; i < productMatrix.length; i++)
			for (int j = 0; j < resultM.length; j++)
				for (int k = 0; k < resultM[0].length; k++)
					resultM[i][j] += productMatrix[i][k] * productMatrix2[k][j];
		
		return resultM; // return product matrix
	}
	
    // print method
	public static void printResult2( int[][] productMatrix, int h, int w)  // take in width height and product matrix
	{
			for (int i = 0; i < w; i++){
			for (int j = 0; j < h; j++)
				System.out.print(" " + productMatrix[i][j]);
			// print out a loop to go through each row, enter a line, and print the next array row to make up the matrix
			System.out.println();
		}
	}
}

