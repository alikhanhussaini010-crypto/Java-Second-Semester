
package ClassesAndObjectsExercises;
/**
 * @author Ali Khan
 */
public class Rectangle {
    
    //  ATRIBUTES
    private double width=1;
    private double height=1;
    
    // CONSTRUCTORES
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    // GETTER METHODS
    public double getArea(){
        return this.width*this.height;
    }
    
    public double getPrimeter(){
        return 2*(this.width+this.height);
    }
    
    public String getDimensions(){
        return "Width: "+this.width +" Height: "+this.height ;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    // SETTER METHODS
    public void setDimensions(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
   
    
    
}
