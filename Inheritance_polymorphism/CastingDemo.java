
package Inheritance_polymorphism;

public class CastingDemo {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(10);
        Rectangle r1 = new Rectangle(12, 45);
        display(c1);
        display(r1);

    }
    
    public static void display(Object o){
        if(o instanceof Circle){
            System.out.println("The area of circle is: "+((Circle) o).getArea());
        }
        else if(o instanceof Rectangle){
            System.out.println("The area of rectangle is: "+((Rectangle) o).getArea());
        }
    }
    
}
