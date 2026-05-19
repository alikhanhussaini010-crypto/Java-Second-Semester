
package ObjectsAndClasses;

public class ArrayOfObjects {
    
    // THIS METHOD WILL CREATE CIRCLES OBJECTS:
    public static Circle[] createCircleArray(int numberOfCircles){
        Circle[] circleArray = new Circle[numberOfCircles];
            for(int i=0; i<circleArray.length; i++){
                circleArray[i] = new Circle();
                circleArray[i].setRadius(Math.random()*100);
            } 
            
        return circleArray;
    }

      // THIS METHOD SUM THE AREA OF CIRCLE OBJECTS:
      public static double sum(Circle[] circleArray){
        double sum = 0;
            for(int i=0; i<circleArray.length; i++)
                sum += circleArray[i].getArea();
        return sum;
    }
      
      // THIS METHOD WILL PRINT ALL CIRCLE OBJECTS:
    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
            for(int i=0; i<circleArray.length; i++)
                System.out.printf("%-30.2f%-15.2f\n" , circleArray[i].getRadius(), circleArray[i].getArea());
            
        System.out.println("---------------------------------------------------");
                System.out.printf("%-30s%-15.2f\n" , "The sum of circles area is: ",sum(circleArray));
            
    }
// THIS IS THE MAIN METHOD:
public static void main(String[] args) {
    
        Circle[] circleArray = createCircleArray(5);
        printCircleArray(circleArray);
    
    } 
}


