
package Chapter8problems;
import java.util.Scanner;
/**
 * @author Ali Khan
 */
public class FindingNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Storing the points;
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        
        System.out.println("Enter "+ numberOfPoints +" points: ");
        for(int i=0; i<points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        // Finding the closest tow points;
        int p0=0 , p1=1;
        double smallestDistance = distance(points[p0][0], points[p0][1], points[p1][0], points[p1][1]);
      
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(distance < smallestDistance){
                    smallestDistance = distance;
                    p0 = i;
                    p1 = j;
                }
            }
        }
        
        System.out.printf("The closest two points are (%.2f , %.2f) (%.2f , %.2f)",points[p0][0],points[p0][1],points[p1][0],points[p1][1]);
    
    }
    
    public static double distance(double x1,double x2, double y1, double y2){
        return Math.sqrt(Math.pow((x1-y1), 2)  +  Math.pow((x2 - y2), 2));
    }
    
}
