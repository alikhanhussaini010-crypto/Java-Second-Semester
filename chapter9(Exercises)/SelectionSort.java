
package ClassesAndObjectsExercises;

/**
 *
 * @author Ali Khan
 */
public class SelectionSort {

    public static void selectionSort(double[] arr){
        for(int i=0; i<arr.length-1; i++){
            double min = arr[i];
            int minIndex = i;
            
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            
            if(minIndex != i){
                arr[minIndex]=arr[i];
                arr[i] = min;
            }
           
        }
        
    }
    
}
