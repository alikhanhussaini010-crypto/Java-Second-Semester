
package Chapater7Problems;
/**
 *
 * @author Ali Khan
 */
public class CountLettersInArray {
    
    //Creating array of 100 random characters
    public static char[] createArray(){
        char[] chars = new char[100];
        for(int i=0; i<chars.length; i++){
            chars[i] = RandomCharacter.getRandomLowerCaseLater();
        }
        return chars;
    }
    
    // Display 100 random characters
    public static void displayArray(char[] chars){
        for(int i=0; i<chars.length; i++){
            if((i+1)%20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i]+"  ");
        }
        
    }
    
    // Counting the number of repeatation from that 100 random characters
    public static int[] counts(char[] chars){
        int[] counts = new int[26];
        for(int i=0;i<chars.length; i++){
            counts[chars[i] - 'a']++;
        }
        return counts;
    }
    
    // Display the occurrences of each letter
    public static void displayCounts(int[] counts){
        for(int i=0; i<counts.length; i++){
            if((i+1)%10 == 0)
                System.out.println(counts[i] +" "+ (char)(i+'a'));
            else
                System.out.print(counts[i] + " "+ (char)(i+'a')+"\t");
        }
        System.out.println("");
        
    }
   
    //  Main method
    public static void main(String[] args) {
       
        char[] randomChars = createArray();
        displayArray(randomChars);
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("The occurrence of each letter are: ");
        
        int[] numberOfRepeatation= counts(randomChars);
        displayCounts(numberOfRepeatation);
   
    }
}
