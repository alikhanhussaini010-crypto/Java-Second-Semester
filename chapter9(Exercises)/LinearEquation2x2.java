
package ClassesAndObjectsExercises;

public class LinearEquation2x2 {
    
    private double a,b,c,d,e,f;

    public void seta(double a){
        this.a = a;
    }
    public void setb(double b){
        this.b = b;
    }
    public void setc(double c){
        this.c = c;
    }
    public void setd(double d){
        this.d = d;
    }
    public void sete(double e){
        this.e = e;
    }
    public void setf(double f){
        this.f = f;
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
    public double getd(){
        return this.d;
    }
    public double gete(){
        return this.e;
    }
    public double getf(){
        return this.f;
    }
    


    public LinearEquation2x2(double a, double b,double c,double d, double e, double f) {
        this.a  = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean isSolvable(){
        if(a*d - b*c != 0)
            return true;
        else
            return false;
    }
    
    public double getX(){
        return (e*d - b*f) / (a*d-b*c);
    }
    
    public double getY(){
        return (a*f-e*c) / (a*d - b*c);
    }
    
    
    
}
