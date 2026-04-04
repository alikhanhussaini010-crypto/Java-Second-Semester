
package Chapater7Problems;

/**
 *
 * @author Ali Khan
 */
public class ReturningArray {
    public static void main(String[] args){
        int[] list = {1,2,3,4,5};
        int[] revers = reverse(list);
 
        for(int r : revers){
            System.out.println(r);
        }
        
        
    }
    /**
     * This method reverse array and store it in different array
     * 
     */
        public static  int[] reverse(int[] numbers){
        int[] result = new int[numbers.length];
        for(int i=0 , j=numbers.length-1; i<numbers.length ; i++,j--){
            result[i] = numbers[j];
        }
        return result;
    }
    
    /**
     * This method reverse the array itself
     *  
     */
    public static int[] reverse1(int[] array){
        for(int i=0,j=array.length-1; i<(array.length/2); i++,j--){
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        return array;
    }
    
}
