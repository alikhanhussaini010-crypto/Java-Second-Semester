
package Chapater7Problems;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class ShiftingElementsOfArray {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double[] myList = new double[6];
        
        System.out.println("Enter the array elements: ");
        for(int i=0; i<myList.length; i++){
            myList[i] = input.nextDouble();
        }
        
        double temp = myList[0];
        
        for(int i=0; i<myList.length-1; i++){
            myList[i] = myList[i+1];
        }
        
        myList[myList.length-1] = temp;
        
        System.out.println(".................................................");
        for(double num : myList){
            System.out.println(num);
        }
        
        
        
        
        
        
        
        
    }
    
    
}
