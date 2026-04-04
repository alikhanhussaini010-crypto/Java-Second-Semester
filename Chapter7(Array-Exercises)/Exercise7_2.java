/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter7Exercises;
/**
 *
 * @author Ali Khan
 */
public class Exercise7_2 {
    public static void main(String[] args){
      java.util.Scanner input = new java.util.Scanner(System.in);
      
        // Creating array
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        
        // Taking the elements from user
        System.out.println("Enter the array elements: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        
        // Algorithm for reversing numbers 
        // 1, 2, 3, 4, 5, 6  OR  1, 2, 3, 4, 5
        for(int i=0 , y=numbers.length-1; i< (numbers.length-1)/2; i++,y-- ){
            int temp = numbers[i];
            numbers[i] = numbers[y];
            numbers[y] = temp;
        }
        
        // Displaying the reverse numbers
        System.out.println("..................................");
        for(int e : numbers){
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
        
    }
}
