
package ClassesAndObjectsExercises;
import java.util.Date;
/**
 *
 * @author Ali Khan
 */
public class Acount {
    
    private int acountId;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Acount(){
        this.dateCreated = new Date();
    }
    
    public Acount(int acountId, double balance, double annualInterestRate){
        if(acountId>100 && balance>1000 && annualInterestRate >0){
            this.acountId=acountId;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = new Date();
        }
    }
    
    // SETTER METHODS
    public void setAcountId(int acountId){
        if(acountId>100)
            this.acountId = acountId;
    }
    
    public void setBalance(double balance){
        if(balance > 1000)
            this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        if(annualInterestRate>0)
            this.annualInterestRate = annualInterestRate;
    }
    
   // GETTER METHODS
    public int getAcountId(){
        return this.acountId;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public double getAnnualInterestRate(){
       return this.annualInterestRate;
    }
    
    public Date getCreatedDate(){
        return this.dateCreated;
    }
    
    // FUNCTIONS
    
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 1200;
    }
    
    public double getMonthlyInterest(){
        return this.getMonthlyInterestRate()*this.balance;
    }
    
    public void deposit(double deposit){
       this.balance += deposit;
    }
    
    public void withdraw(double withdraw){
        this.balance -= withdraw;
    }
    
    
    
    
}
