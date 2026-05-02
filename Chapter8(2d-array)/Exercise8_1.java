
package Chapter8Exercises;
/**
 *
 * @author Ali Khan
 */
public class Exercise8_1 {
    public static void main(String[] args) {
        double[][] matrix ={
                                    {1 ,2 ,3},
                                    {4, 5, 6},
                                    {7 ,8 ,9}
                                    };
        
        System.out.println(sumColmun(matrix, 2));
    }
    //Sum elements column by column)
    public static double sumColmun(double[][] matrix, int colmunIndex){
            double sum = 0;
            
            for(int row=0; row<matrix.length; row++)
                sum += matrix[row][colmunIndex];
            
        return sum;
    }
    
}
