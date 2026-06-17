
package Inheritance_polymorphism;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JFrame;



public class InheritanceHierarchy {
    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
      
       
        
        System.out.println(fruit instanceof Fruit);
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof McIntosh);
        System.out.println( orange instanceof Orange);
        System.out.println( orange instanceof Fruit);
        System.out.println(fruit);
     
       
        
       
        
        
        
        
    }
    
    
}


class McIntosh extends Apple{
    
}

class GoldenDelicious extends Apple{
    
}

class Orange extends Fruit{
    
}

class Apple extends Fruit{
    public void makeAppleCider(){
    
}
    
}

class Fruit{
    
}
