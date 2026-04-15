
package Chapter7Exercises;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class Exercise7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the scores below 100  ( If you enter the negitive the input ends ): ");
        int count =0;
        int score = 1;
        int[] num = new int[50];
        
        double sum =0;
        while(score > 0){
            score = input.nextInt();
         
            if(score > 0)
                 num[count] = score; 
            
            sum+=score;
            count++;
      
        }
        
        double ave = sum / count;
        System.out.printf("The average is %.2f:\n",ave);
        
        int above = 0;
        int low = 0;
        for(int i=0; i<count-1; i++){
            if(num[i] >= ave)
                above++;
          else  if(num[i] < ave)
                low++;
                
        }
        
        System.out.println("Above the average:\n"+ above);
        System.out.println("low the average:\n"+ low);
        
        
   
        
        
    }
    
}
