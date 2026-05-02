
package Chapter8problems;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class PassingArrayIntoMethods {
    public static void main(String[] args) {
        
        int[][] matrix = getArray(3, 4);
        int sam = sum(matrix);
        System.out.println(sam);
    }
    
    public static int[][] getArray(int row, int column){
        Scanner input = new Scanner(System.in);
        int[][] m = new int[row][column];
        System.out.printf("Enter %d rows and %d columns:\n ",m.length , m[0].length);
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    
    public static int sum(int[][] arr){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                total += arr[i][j];
            }
        }
        return total;
    }
    
}
