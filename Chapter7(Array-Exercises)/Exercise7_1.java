package Chapter7Exercises;


import java.util.Scanner;
/**
 *
 * @author Ali Khan
 */
public class Exercise7_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        
        // Reading the students scoores
        System.out.printf("Enter %d scores:\n",students);
        int[] scores = new int[students];
        for(int i=0; i<scores.length; i++){
            scores[i] = input.nextInt();
        }
        
        // Finding the best number
        int best = scores[0];
        for(int i=0; i<scores.length; i++){
            if(scores[i] > best)
                best = scores[i];
        }
        
        // Assigning the grades to the students
        for(int i=0; i<scores.length; i++){
            if(scores[i] >= best-10)
                System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+'A');
            
            else if(scores[i] >= best-20)
                 System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+'B');
            
            else if(scores[i] >= best-30)
                 System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+'C');
                
           else if(scores[i] >= best-40)
                 System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+'D');
            else
                 System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+'F');
        }
        
        
        
        
        
        
        
        
    }
    
}
