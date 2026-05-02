
package Chapter8problems;

import java.util.Scanner;

/**
 *
 * @author Ali Khan
 */
public class WeatherInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // diclearing the array of data;
        final int numberOfDays = 1;
        final int numberOfHours = 3;
        double[][][] data = new double[numberOfDays][numberOfHours][2];
        
        for(int i=0; i<numberOfDays * numberOfHours; i++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day-1][hour-1][0] = temperature;
            data[day-1][hour-1][1] = humidity;
        }
        
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
