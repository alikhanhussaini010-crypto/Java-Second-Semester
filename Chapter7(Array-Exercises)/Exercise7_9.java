
package Chapter7Exercises;

/**
 *
 * @author Ali Khan
 */
public class Exercise7_9 {
    public static void main(String[] args) {
        double[] numbers = {12 , 34.90, 56, 6, 2.7, 1.5, 78.7};
        double min = min(numbers);
        System.out.println(min);
    }

    public static double min(double[] list){
        double min = list[0];
               for(int i=1; i<list.length; i++){
                   if(list[i] < min)
                       min = list[i];
               }
        return min;
    }
    
}
