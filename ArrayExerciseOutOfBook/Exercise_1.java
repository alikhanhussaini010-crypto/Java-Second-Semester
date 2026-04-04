/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OutOfBookExercises;

/**
 *
 * @author Ali Khan
 */
public class Exercise_1 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the X number: ");
        float x = input.nextFloat();
        
        System.out.println("Enter the array elemetns: ");
        float[] a = new float[5];
        for(int i=0; i<a.length; i++){
            a[i] = input.nextFloat();
        }
        
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(x == a[i])
                count++;
        }
        
        System.out.printf("The number X in the given array is repeated %d times:\n ",count);
        
        
        
        
    }
    
}
