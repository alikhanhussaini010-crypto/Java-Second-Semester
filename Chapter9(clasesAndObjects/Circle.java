
package ObjectsAndClasses;

/**
 * @author Ali Khan
 */
public class Circle {
    
    // properties
  private double radius = 1;
  private  static int numberOfObjects;
    
    // constructor
    public Circle(){
        numberOfObjects++;
    }
    
   public  Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    
    // methods
    
      public double getArea(){
        return Math.PI * radius*radius;
    }
    
   public double getPerimeter(){
        return 2*Math.PI * radius;
    }

  public  void setRadius(double newRadius){
        radius = newRadius;
    }
    
   public double getRadius(){
        return radius;
    }
    
    
  public  static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
}
