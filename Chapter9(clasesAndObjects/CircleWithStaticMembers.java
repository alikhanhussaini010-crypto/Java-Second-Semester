
package ObjectsAndClasses;

public class CircleWithStaticMembers {
    
    public  double radius;
    private static int numberOfObjects;
    public CircleWithStaticMembers() {
        numberOfObjects++;
    }
    
    public CircleWithStaticMembers(double newRadius) {
        this.radius = newRadius;
        numberOfObjects++;
    }
    
    public  double getArea(){
        return radius*radius*Math.PI;
    }
    
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    
    
}
