
package Chapter7Exercises;

/**
 *
 * @author Ali Khan
 */
public class Exercise7_8 {

    public static double average(int[] numbers){
        double sum = 0;
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
        }
            return (sum / numbers.length);
    }
    
     public static double average(double[] numbers){
        double sum = 0;
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
        }
            return (sum / numbers.length);
    }

}
