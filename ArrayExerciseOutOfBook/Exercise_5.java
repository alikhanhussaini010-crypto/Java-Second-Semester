
package OutOfBookExercises;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class Exercise_5 {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
        double[] a = new double[5];
        double[] b = new double[3];
        double[] c = new double[a.length + b.length];
        
         // Reading array
        System.out.println("Enter the A array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = input.nextDouble();
        }

        System.out.println("Enter the B array elements: ");
        for(int i=0; i<b.length; i++){
            b[i] = input.nextDouble();
        }
        
        // 1 2 3 4  5
        // 1 6 7 
        
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j])
                    break;
            }
        }
        
        
        
     
     }
}
