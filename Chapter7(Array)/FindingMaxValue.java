package Chapater7Problems;


import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class FindingMaxValue {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
    
        int[] myList = new int[5];
        
        System.out.println("Enter the array elements: ");
        for(int i=0; i<myList.length; i++){
            myList[i] = input.nextInt();
        }
        
        int max = myList[0];
        for(int i=1; i<myList.length; i++){
            if(myList[i] > max){
                max = myList[i];
            }
        }
        
        System.out.println("The maximim number in the enterd array is " + max);
        
        
        
        
    }
    
    
}
