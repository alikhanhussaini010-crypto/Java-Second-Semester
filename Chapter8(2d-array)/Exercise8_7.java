
package Chapter8Exercises;
import java.util.Scanner;

/**
 * @author Ali Khan
 */
public class Exercise8_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][3];
        System.out.println("Enter the points: ");

        for(int i=0; i<points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            points[i][2] = input.nextDouble();
        }
                
        int p0 = 0;
        int p1 = 1;
        double shortestDistance = distance(points[p0][0], points[p0][1],points[p0][2], points[p1][0],points[p1][1],points[p1][2]);
        
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                double distance = distance(points[i][0],points[i][1],points[i][2],points[j][0],points[j][1],points[j][2]);
                if(distance < shortestDistance){
                    shortestDistance = distance;
                    p0 = i;
                    p1 = j;
                }
            }
        }
        
        System.out.printf("The nearest points are (%.2f, %.2f, %.2f) and (%.2f, %.2f, %.2f)"
        ,points[p0][0],points[p0][1],points[p0][2] , points[p1][0],points[p1][1],points[p1][2]);
        
        
    }
    public static double distance(double x1 , double y1, double z1, double x2, double y2, double z2){
        return Math.sqrt( Math.pow( (x2-x1), 2) + Math.pow( (y2-y1), 2) + Math.pow( (z2-z1), 2) );
    }
}
