
package Chapter8Exercises;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class Exercise8_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // taking the array elements:
        double [][] matrix= new double[4][4];
        System.out.println("Enter 4-by-4 matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();
            
        }
        System.out.println("The sum of major diagonal elements is: "+sumMajorDiagonal(matrix));
        
        
    }
    
    // difining the method for summing the major diagonal elemetns:
    public static double sumMajorDiagonal(double[][] matrix){
        double total = 0;
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    if(i == j)
                        total+=matrix[i][j];
                }
            }
        return total;
    }
    
    
}
