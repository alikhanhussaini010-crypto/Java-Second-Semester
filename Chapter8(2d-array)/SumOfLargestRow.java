
package Chapter8problems;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class SumOfLargestRow {
    
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
        
        int maxRow = 0;
        int maxRowIndex=0;
        for(int i=0; i<matrix.length; i++){
           int sum = 0;
            for(int j=0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
            if(maxRow < sum ){
                maxRow = sum;
                maxRowIndex = i;
            }
            
        }
        
        System.out.println("Row "+maxRowIndex+" has the maximum sum of "+maxRow);
        
        
        
    }
    
}
