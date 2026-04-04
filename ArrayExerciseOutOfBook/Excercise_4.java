
package OutOfBookExercises;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class Excercise_4 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Creating array
        System.out.print("Enter the size of first array: ");
        int first = input.nextInt();
        double[] a = new double[first];
        
        System.out.print("Enter the size of second array: ");
        int second = input.nextInt();
        double[] b = new double[second];
        
        int length;
        if(first < second)
            length = first;
        else
            length  = second;
        
        double[] c = new double[length];
        
        // Reading array
        System.out.println("Enter the first array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = input.nextDouble();
        }

        System.out.println("Enter the second array elements: ");
        for(int i=0; i<b.length; i++){
            b[i] = input.nextDouble();
        }
        
        // Making algorithm
        int count =0;
        for(int i=0; i<a.length; i++){
            
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    c[count]=a[i];
                    count++;
                }
            }
          
        }
        // Displaying array
         System.out.println("-----------------------------------");
        for(int i=0; i<c.length;i++){
            System.out.println(c[i]);
        }
        
        
        
    
     }
}
