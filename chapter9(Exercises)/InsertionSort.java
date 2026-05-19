
package ClassesAndObjectsExercises;

/**
 *
 * @author Ali Khan
 */
public class InsertionSort {
  
    public static double[] insertionSort(double[] list){
        // 8 6 4 2 1
        for(int i=1; i<list.length; i++){
               double key = list[i];
               double temp;
               int j = i-1;
                    while(j>=0 && key<list[j]){
                              temp = list[j];
                              list[j]  = list[j+1];
                              list[j+1] = temp;
                              j--; 
                    }
        }
        return list;
    }
    
    
    
    
}
