
package Inheritance_polymorphism;
import java.util.Scanner;
import java.util.ArrayList;
public class DistinctNumbers {
    
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList();
    
        System.out.println("Enter integers (The input ends if 0 ): ");
        int value;
        
        do{
            value = input.nextInt();
                if(!list.contains(value) && value!=0){
                    list.add(value);
                }
                
        }while(value!=0);
        
        System.out.println("The distinct numbers are: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"  ");
        } 
        System.out.println("");
    
    
    }
}
    
