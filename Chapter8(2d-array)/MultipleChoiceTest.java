
package Chapter8problems;

/**
 *
 * @author Ali Khan
 */
public class MultipleChoiceTest {
    public static void main(String[] args) {
     
        
        // Student's answers;
    char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        int maxRow = 0;
        int maxRowIndex = 0;
        for(int i=0; i<answers.length; i++){
            int correctCount=0;
            for(int j=0; j<answers[i].length; j++){
                if(answers[i][j] == keys[j])
                    correctCount++;
                
            }
            if(correctCount > maxRow){
                maxRow = correctCount;
                maxRowIndex = i;
            }
            
            System.out.printf("The %dth student correct answer is: %d\n",(i+1),correctCount);
        }
        System.out.println("_______________________________________________");
        System.out.printf("Student %dth has the highest number of correct answer: %d\n ",maxRowIndex,maxRow);
        
        
        
        
        
        
        
    }
       
}
