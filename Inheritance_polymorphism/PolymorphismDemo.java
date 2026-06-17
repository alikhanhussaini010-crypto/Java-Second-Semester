
package Inheritance_polymorphism;

public class PolymorphismDemo {
    
    public static void main(String[] args) {
        displayObject(new GeometricObject("red", true) );
        displayObject(new Circle(10, "Blue", true) );
        displayObject (new Rectangle(5, 6, "Orange", false) );
        
        
    }
    
    
    public static void displayObject(GeometricObject object){
        System.out.println("Created on "+object.getCreatedDate()+" and its color is "+object.getColor());
    }
    
}
