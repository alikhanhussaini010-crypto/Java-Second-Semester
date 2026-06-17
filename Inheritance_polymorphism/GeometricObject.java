
package Inheritance_polymorphism;

import java.util.Date;

public class GeometricObject {
    private String color = "White";
    private boolean isFilled;
    private Date createdDate;
   
    public GeometricObject(){
        createdDate = new Date();
    };
    
    public GeometricObject(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
        createdDate = new Date();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean IsFilled() {
        return isFilled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    
    public String toString(){
        return "Created Date: "+this.createdDate+"\nColor:"+this.color+"\nIsFilled: "+this.isFilled;
    }

    
}
