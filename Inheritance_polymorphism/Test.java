
package Inheritance_polymorphism;

import java.util.Objects;

public class Test {
public static void main(String[] args) {
    
    Circle circle = new Circle();
    GeometricObject object = new Circle();
      
    System.out.println(circle instanceof GeometricObject);
    System.out.println(object instanceof GeometricObject);
    System.out.println(circle instanceof Circle);
    System.out.println(object instanceof Circle);
    
    Object c1 = new Circle();
    Object c2 = new Circle();
    System.out.println(c1.equals(c2));
    
  }
}
