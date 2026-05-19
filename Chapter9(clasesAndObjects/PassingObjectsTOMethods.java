
package ObjectsAndClasses;

/**
 * @author Ali Khan
 */
public class PassingObjectsTOMethods {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        
        printAreas(c, 5);
        
    }
    
    public static void printAreas(Circle c, int times){
        System.out.println("Radius\t\tArea");
        while(times >= 1){
            System.out.println(c.getRadius()+"\t\t"+c.getArea());
            c.setRadius(c.getRadius()+1);
            times--;
        }
        
    }
    
}
