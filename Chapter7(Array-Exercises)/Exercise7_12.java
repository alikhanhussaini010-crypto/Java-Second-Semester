/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter7Exercises;

/**
 *
 * @author Ali Khan
 */
public class Exercise7_12 {
    public static void main(String[] args) {
        
        // TEST PROGRAM
         double[] numbers = {1,2,3,4,5,6};
         reverse(numbers);
         System.out.println(java.util.Arrays.toString(numbers));
    }
    
    
    /**
     * This method reverse an array without copying into another array
     */
    public static void reverse(double[] list){
        double temp;
        for(int i=0, j=list.length-1; i<list.length/2; i++,j--){
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        
    }
    
}
