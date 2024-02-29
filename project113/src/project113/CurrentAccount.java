package project113;

public class CurrentAccount extends Account{
	private double overdraftLimit ; 
	
CurrentAccount (String accNum,double balance,boolean accType,int maxTransaction, double overdraftLimit){
		super(accNum , balance , accType ,maxTransaction );
		this.overdraftLimit = overdraftLimit;
	 
public String CheckAccountType(){
return "Current Account"
}
	
	public String withdraw(double amount) {
        if (balance + overdraftLimit - amount >= 0) {
            balance -= amount;
            return "Withdrawal successful. New balance: " + balance;
        } else {
            return "Withdrawal not allowed.";
        }
    }
	public String toString() { 
		return super.toString()+"\nOverdraft limit is: "+overdraftLimit ;
	}

}
