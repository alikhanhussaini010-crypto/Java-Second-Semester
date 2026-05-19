
package ClassesAndObjectsExercises;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       System.out.println("Enter a,b and c: ");
       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();
        
        QuadraticEquation e1 = new QuadraticEquation(a, b, c);
        
        if(e1.getDiscriminant() > 0)
            System.out.printf("Root1: %.2f\nRoot2: %.2f\n", e1.getRoot1(), e1.getRoot2());
        else if(e1.getDiscriminant() ==0)
            System.out.printf("Root1: %.2f\nRoot2: %.2f\n", e1.getRoot1(), e1.getRoot2());
        else
            System.out.println("The equation does not have any solution: ");
        
        
    }
    
}
