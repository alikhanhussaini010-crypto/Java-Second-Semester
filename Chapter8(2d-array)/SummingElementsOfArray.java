
package Chapter8problems;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class SummingElementsOfArray {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of row for matrix: ");
        int row = input.nextInt();
        System.out.print("Enter the number column for matrix: ");
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        
        for(int i=0; i<matrix.length; i++){
            System.out.printf("Enter the %dth row elements:\n",(i+1));
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Displaying matrix:
         System.out.println("The matrix is as follow:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("______________________________________________");
        
        // SUMMINTG ALL ELEMENTS
        int total = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                total+=matrix[i][j];
            }
        }
        System.out.println("The sum of all elements is: "+total);
        System.out.println("______________________________________________");
        // SUMMING BY EACH COLUMN
        for(int col=0; col<matrix[0].length; col++){
            int sum =0;
                for(int ro=0; ro<matrix.length; ro++){
                    sum += matrix[ro][col];
            }
                System.out.printf("The sum of %dth colmun is: %d\n",(col+1), sum);
        }
        
        
        
        
    }
}
