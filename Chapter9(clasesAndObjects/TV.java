
package ObjectsAndClasses;

/**
 * @author Ali Khan
 */
public class TV {
   
    // Defining proeperties:
    int channel;
    int volumeLevel;
    boolean on;
    
    // Defining costructor and methods:
    public TV(){
        
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setChannel(int newChannel){
        if(on && newChannel >=1 && newChannel <= 120)
            channel = newChannel; 
    }
    
    public void setVolume(int newVolume){
        if(on && newVolume >=1 && newVolume<=7)
            volumeLevel = newVolume;
    }
    
    public void channelUp(){
        if(on &&  channel < 120)
            channel++;
    }
    
    public void channelDown(){
        if(on && channel > 1)
            channel--;
    }
    
    public void volumeUp(){
        if(on && volumeLevel < 7)
            volumeLevel++;
    }
    
    public void volumeDown(){
        if(on && volumeLevel >1)
            volumeLevel--;
    }
    
    
}
