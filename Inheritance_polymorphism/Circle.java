
package Inheritance_polymorphism;

public class Circle extends GeometricObject {
    private double radius;
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle( double radius, String color, boolean isFilled){
        this.radius = radius;
        setColor(color);
        setFilled(isFilled);
       
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        return Math.PI * radius*radius;
    }
    
    public double getDiameter(){
        return 2*this.radius;
    }
    
    public double getPerimeter(){
        return 2* Math.PI*radius;
    }
    
    @Override
    public String toString(){
       return super.toString() +"\nradius"+this.radius;
    }
    
//    @Override
//    public boolean equals(Object obj){
//        if(obj instanceof Circle)
//            return radius == ((Circle) obj).radius;
//        else
//            return false;
//    }
    
    
    public boolean equals(Object o){
        return this.radius == ((Circle)o).radius;
    }
 
}
