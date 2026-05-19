
package ObjectsAndClasses;

/**
 * @author Ali Khan
 */
public class Circle1 {
    
    private double radius;
      public Circle1(double radius){
        this.radius = radius;
    }
    
    public Circle1(){
        this(10);
       
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    
}
