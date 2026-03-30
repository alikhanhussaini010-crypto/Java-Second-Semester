package Chapater7Problems;


import java.util.Scanner;


/**
 *
 * @author Ali Khan
 */
public class FindingTheSmallestIndexOfTheLargestElement {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double[] myList = new double[6];
        
        System.out.println("Enter the array elements: ");
        for(int i=0; i<myList.length; i++){
            myList[i] = input.nextDouble();
        }
        
     
        double max = myList[0];
        int indexOfMax = 0;
        for(int i=1; i<myList.length; i++){   
            if(myList[i] > max){
                max = myList[i];
                indexOfMax = i;
            }
            
        }
        
        System.out.println("The smallest index of the largest array is: "+indexOfMax);
        

    }
    
    
    
    
    
}
