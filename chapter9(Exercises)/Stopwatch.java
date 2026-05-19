
package ClassesAndObjectsExercises;

public class Stopwatch {
    private long startTime;
    private long endTime;
    
    public double getStartTime(){
        return this.startTime;
    }
    
    public double getEndTime(){
        return this.endTime;
    }
    
    
    public Stopwatch(){
        this.startTime  = System.currentTimeMillis();
    }
    
    
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
    
    
    
}
