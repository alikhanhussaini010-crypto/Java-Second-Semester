
package Chapater7Problems;

/**
 *
 * @author Ali Khan
 */
public class ArraySearch {
    
    public  int linearSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i])
                return i;
        }
        return -1;
    }
    // 12,13,14,23,34,56,78,89
    
    public static int binarySearch(int[] arr, int key){
        int low = 0; 
        int high = arr.length-1;
        
        while(high >= low){
            int mid = low+high /2;
            
            if(key > arr[mid])
                low = mid+1;
            else if(key == arr[mid])
                return mid;
            else 
                high = mid-1;
        }
        return -low-1;
    }
   
    
    
}




