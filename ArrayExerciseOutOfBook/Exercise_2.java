
package OutOfBookExercises;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        double[] a = new double[4];
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
        
        // Algorithm for goining two array
        for(int i=0; i<c.length; i++){
            if(i<a.length){
                c[i] =a[i];
            }
            else
                c[i]=b[i-a.length];
            
       }
        //Displaying array
        System.out.println("...................................");
        for(double p : c){
            System.out.println(p);
        }
            
        
        
        
        
        
    }
    
}
