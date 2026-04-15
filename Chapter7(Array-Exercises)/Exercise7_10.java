
package Chapter7Exercises;

/**
 *
 * @author Ali Khan
 */
public class Exercise7_10 {
    public static void main(String[] args) {
        //  TEST PROGRAM
         double[] numbers = {12 , 34.90, 56, 6, 2.7, 1.5,1.5, 78.7};
         int indexOfSmallestElement = indexOfSmallestElement(numbers);
         System.out.println(indexOfSmallestElement);
    }
    /**
     * Programming for finding the index of smallest element in an array of doubles
     */
    public static int indexOfSmallestElement(double[] list){
        double min = list[0];
        int indexMin = 0;
            for(int i=1; i<list.length; i++){
                
                if(list[i] < min){
                    min = list[i];
                    indexMin = i;
                }
                
            } 
        return indexMin;
    }
    
    
    
}
