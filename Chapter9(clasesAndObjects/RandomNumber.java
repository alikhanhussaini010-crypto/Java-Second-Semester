
package ObjectsAndClasses;
import java.util.Random;
public class RandomNumber {
   
    public static void main(String[] args) {
   
        Random generator1 = new Random(10);
        Random generator2 = new Random(10);
        
        System.out.println("The generator1 numbers are:");
        for(int i=0; i<10; i++){
            System.out.print(generator1.nextInt(10)+"  ");
        }
    
           System.out.println("\nThe generator2 numbers are:");
        for(int i=0; i<10; i++){
            System.out.print(generator2.nextInt(10)+"  ");
        }
        System.out.println("");
        
    }
}
