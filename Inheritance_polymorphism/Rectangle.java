
package Inheritance_polymorphism;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    
    public Rectangle(){};
    
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    };
    
    public Rectangle(double width , double height, String color, boolean isFilled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(isFilled);
    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getPerimeter(){
        return 2*(this.width + this.height);
    }
    
    
}
