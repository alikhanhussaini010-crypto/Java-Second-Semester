
package ClassesAndObjectsExercises;

public class QuadraticEquation {
    private double a,b,c;
    
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public double geta(){
        return this.a;
    }
    
    public double getb(){
        return this.b;
    }
    
    public double getc(){
        return this.c;
    }
    
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }
    
    public double getRoot1(){
        if(getDiscriminant() >= 0)
               return (-b-Math.sqrt(getDiscriminant()) ) / 2*a;
        else
            return 0;
    }
    
     public double getRoot2(){
         if(getDiscriminant() >= 0)
                return (-b+Math.sqrt(getDiscriminant()) ) / 2*a;
         else
             return 0;
    }
    
    
}
