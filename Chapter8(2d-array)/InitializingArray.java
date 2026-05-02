
package Chapter8problems;
import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class InitializingArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of row for matrix: ");
        int row = input.nextInt();
        System.out.print("Enter the number column for matrix: ");
        int column = input.nextInt();
        int[][] matrix1 = new int[row][column];
        
        for(int i=0; i<matrix1.length; i++){
            System.out.printf("Enter the %dth row elements:\n",(i+1));
            for(int j=0; j<matrix1[i].length; j++){
                matrix1[i][j] = input.nextInt();
            }
        }
        
        
        System.out.println("The matrix is as follow:");
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
    }
    
}
