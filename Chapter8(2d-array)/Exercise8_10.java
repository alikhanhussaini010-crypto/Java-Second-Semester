
package Chapter8Exercises;

/**
 * @author Ali Khan
 */
public class Exercise8_10 {
    public static void main(String[] args){
        int[][] matrix = new int[4][6];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        int maxRow =0; 
        int maxRowIndex=0;
        for(int row=0; row<matrix.length; row++){
            int total = 0;
            for(int col=0; col<matrix[row].length; col++){
                total += matrix[row][col];
            }
            if(total > maxRow){
                maxRow=total;
                maxRowIndex=row;
            }
        }
        
           int maxColmun =0;
           int MaxColmunIndex =0;
            for(int col=0; col<matrix[0].length; col++){
            int total = 0;
            for(int row=0; row<matrix.length; row++){
                total += matrix[row][col];
            }
            if(total >maxColmun){
                maxColmun=total;
                MaxColmunIndex=col;
            }
        }
 
        System.out.println("The largest row index is: "+maxRowIndex);
        System.out.println("The largest colmun index is: "+MaxColmunIndex);
        
        
        
        
        
        
        
        
       
        
    }
    
}
