
package Chapater7Problems;
/**
 *
 * @author Ali Khan
 */
public class RadixSort {
      public static void main(String[] args) {

        int[] arr = {25,250,40,12};
        radixSort(arr);
        
        for(int num : arr){
            System.out.println(num+" ");
        }
      }

      static void radixSort(int[] arr){   // 2 5,25      0,12,40
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        // max = 250
            
            for(int exp=1; max / exp > 0; exp*=10){
                countingSort(arr, exp);
            }
    }

       static void countingSort(int[] arr, int exp){
           
        int[] output = new int[arr.length]; // 4
        int[] count = new int[10]; // 0  9
        
        // 25 250 12 40  
       // count[5]=1, count[0] =2,count[2]=1 
        for(int i=0; i<arr.length; i++)
            count[(arr[i] / exp) % 10]++;
        
        // count[0]=2 ,count[1] = 2, count[2]=3, count[3]=3, count[4]=3, count[5]=4
        // count[6] = 4
        for(int i=1; i<10; i++)
            count[i] = count[i] + count[i - 1];     
        
        // output[1]=40, output[2]=12, output[0]=250, output[3]=25
         // 250,40,12,25
        for(int i = arr.length-1; i>=0; i--){
            output[ count[ (arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;                           
        }
        for(int i =0; i<arr.length; i++){
            arr[i] = output[i];
        }
 
     }
 
}
