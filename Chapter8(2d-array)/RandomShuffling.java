
package Chapter8problems;

/**
 *
 * @author Ali Khan
 */
public class RandomShuffling {
    public static void main(String[] args) {
        
        int[][] matrix = {
            
                                {1 ,2, 3}
                               ,{4, 5, 6, },
                                {7, 8, 9}
                
                              };
        
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                int temp = matrix1[j];
                int row = (int)(Math.random()*matrix.length);
                int column = (int)(Math.random()*matrix.length);
                matrix1[j] = matrix[row][column];
                matrix[row][column] = temp;
            }
        }
        
         // Displaying matrix:
         System.out.println("The matrix is as follow:");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + "\t");
            }
            System.out.println("");
        }
        
        
    }
    
}
