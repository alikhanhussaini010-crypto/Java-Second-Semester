
package ClassesAndObjectsExercises;

public class Fan {
    
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    // Data fields and thier setter getter methods;
    private int speed= SLOW;
    private boolean on;
    private double radius =5;
    private String color = "Blue";
    
    public void setSpeed(int speed){
        if(on && speed >=1 && speed<=3)
            this.speed=speed;
    }
    
    public String getSpeed(){
            String spe ="";
             if (on && this.speed == 2)
            spe = "MEDIUM";
            else if(on && this.speed == 3)
                spe = "FAST";
            else
                spe = "SLOW";
            
            return spe;
            }
    
    
    public void setOn(){
        this.on = true;
    }
    
    public void setOff(){
        this.on = false;
    }
    
    
    public void setRadius(double radius){
        if(radius >= 0)
            this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    
    
    public Fan(){
        
    }
    
    public String  toString(){
        if(on == true)
            return "Fan speed: "+getSpeed() +"\nFan color: "+this.color+"\nFan radius: "+this.radius;
        else
            return "Fan color: "+this.color+"\nFan radius: "+this.radius +"\nFan is off";
    }
    
    
    
    
    
}
