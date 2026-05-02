
package Chapter8problems;

/**
 * @author Ali Khan
 */
public class Weather {
    public static void main(String[] args) {
        
        // diclearing the array of date;
        final int numberOfDays = 4;
        final int numberOfHours = 5;
        double[][][] data = { 
            { {23,34}, {34,56}, {45,23}, {34,45},  {45,56} },
            { {45,67}, {67,23}, {34,23}, {34,23},  {45,23}},
            { {34,23}, {23,45} ,{45,56} , {23, 45},  {34,23}},
            {{23,45}, {34,56}, {23,45}, {34,23}, {34,23}}
           
        };
        
        // counting and displaying the average of temperature and humidity
        for(int i=0; i<numberOfDays; i++){
            double dailyTemperatureTotal = 0;   double dailyHumidityTotal = 0;
            for(int j=0; j<numberOfHours; j++){
                // finding the total of temperature and humidity
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
                
            }
            System.out.println("Day"+(i+1)+"'s average temperature is:"+ (dailyTemperatureTotal/numberOfHours) );
            System.out.println("Day"+(i+1)+"'s average humidity is:"+ (dailyHumidityTotal/numberOfHours) );  
        }
        // end of programm
        
        
    }
    
}
