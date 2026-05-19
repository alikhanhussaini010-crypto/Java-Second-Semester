
package ClassesAndObjectsExercises;

import ClassesAndObjectsExercises.Acount;

/**
 *
 * @author Ali Khan
 */
public class AcountTest {
    public static void main(String[] args) {
        
        Acount fahim = new Acount(1122, 20000, 4.5);
        
        fahim.withdraw(2500);
        fahim.deposit(3000);
        
        System.out.println(fahim.getBalance());
        System.out.println(fahim.getMonthlyInterestRate());
        System.out.println(fahim.getMonthlyInterest());
        System.out.println(fahim.getCreatedDate());
        
    }
}
