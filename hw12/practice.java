// TestMatrixOperation.java: Add and multiply two matrices
import java.util.Scanner;
public class practice
{
	/** Main method */
	public static void main(String[] args){
		
	 Scanner myScanner = new Scanner(System.in);
        
        boolean a=false;
        boolean b=false;
        boolean c=false;
        boolean d=false;
        
        System.out.print("Enter an integer width: ");
       double widthInput = myScanner.nextDouble();
        
        while (a == false || b == false){
            if (widthInput % 1 == 0){
                a = true;
            }
            else {
                a = false;
                b = false;
                System.out.print("ERROR: Not an integer. Enter an integer width: ");
                widthInput = myScanner.nextDouble();
            }
            if (widthInput > 0){
                b = true;
            }
            else{
                a = false;
                b = false;
                System.out.print("ERROR: Less than or equal to zero. Enter a positive width: ");
                widthInput = myScanner.nextDouble();
            }
        }
        
        System.out.print("Enter an integer height: ");
       double heightInput = myScanner.nextDouble();
        
        while (c == false || d == false){
            if (heightInput % 1 == 0){
                c = true;
            }
            else {
                c = false;
                d = false;
                System.out.print("ERROR: Not an integer. Enter an integer height: ");
                heightInput = myScanner.nextDouble();
            }
            if (heightInput > 0){
                d = true;
            }
            else{
                c = false;
                d = false;
                System.out.print("ERROR: Less than or equal to zero. Enter a positive height: ");
                heightInput = myScanner.nextDouble();
            }
        }
    
    int width= (int) widthInput;
    int height= (int)heightInput;
     // Create two matrices as two dimensional arrays
		int[][] matrix1 = new int[height][width];
		int[][] matrix2 = new int[height][width];
		

		for (int i = 0; i < matrix1.length; i++)
			for (int j = 0; j < matrix1[i].length; j++) 
			{
				matrix1[i][j] = (int)(Math.random() * 20-10);
				matrix2[i][j] = (int)(Math.random() * 20-10);
			}
	
	
		
		// Multiply two matrices and print the result
		int [][] resultMatrix = multiplyMatrix(matrix1, matrix2);
		System.out.println("\nThe multiplication of the matrices is ");
		printResult2( resultMatrix, height, width);
	}
	
	
	
	

	
	/** The method for multiplying two matrices */
	public static int[][] multiplyMatrix(int[][] productMatrix, int[][] productMatrix2) 
	{
		int[][] result = new int[productMatrix.length][productMatrix2[0].length];
		for (int i = 0; i < productMatrix.length; i++)
			for (int j = 0; j < result.length; j++)
				for (int k = 0; k < result[0].length; k++)
					result[i][j] += productMatrix[i][k] * productMatrix2[k][j];
		
		return result;
	}
	

	public static void printResult2( int[][] productMatrix, int h, int w) 
	{
			for (int i = 0; i < w; i++){
			for (int j = 0; j < h; j++)
				System.out.print(" " + productMatrix[i][j]);
			
			System.out.println();
		}
	}
}

