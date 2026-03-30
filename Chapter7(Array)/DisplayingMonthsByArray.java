
package Chapater7Problems;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class DisplayingMonthsByArray {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        String[] months = {
            
             "January"    ,  "February"    ,   "March", 
             "April"         ,  "May"           ,   "June" ,
             "July"          ,  "Augest"       ,   "Sebtember",
             "October  "  ,  "November"   ,   "December"
        
        };
        
        
        System.out.print("Enter the number of month (1 to 12): ");
        int num = input.nextInt();
        
        if(num >= 1 && num <= 12)
             System.out.printf("The month is %s\n",months[num-1]);
        else
            System.out.println("Invalid input! ");
        
        
        
        
        
        
    }
    
}
