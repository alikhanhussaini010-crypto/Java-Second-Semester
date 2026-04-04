
package OutOfBookExercises;

import Chapater7Problems.RandomCharacter;

/**
 *
 * @author Ali Khan
 */
public class Exercise_6 {
    
    public static char[] createArray(){
        char[] chars = new char[100];
        for(int i=0; i<chars.length; i++ ){
            chars[i] = RandomCharacter.getRandomUpperCaseLater();
        }
        return chars;
    }
    
    public static void displayArray(char[] chars){
        for(int i=0; i<chars.length; i++ ){
            if((i+1)%20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i]+"  ");
        }
    }
    
    
    public static int[] counts(char[] chars){
        int[] counts = new int[26];
        for(int i=0; i<chars.length; i++){
            counts[chars[i] - 'A']++;
        }
        return counts;
    }
    
    public static void displayCounts(int[] counts){
        
        for(int i=0; i<counts.length; i++){
          if((i+1)%10 == 0)
                System.out.println(counts[i]+" "+(char)(i+'A'));
          else
                System.out.print(counts[i] +" "+ (char)(i+'A')+"  ");
        }
        System.out.println("");
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    
        char[] randomChars = createArray();
        displayArray(randomChars);
        System.out.println("-------------------------------------------------------------------------------");
        int[] numberOfRepeatation = counts(randomChars);
        
        displayCounts(numberOfRepeatation);
        
    }
    
}
