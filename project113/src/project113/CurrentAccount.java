package project113;

public class CurrentAccount extends Account{
	private double overdraftLimit ; 
	
	CurrentAccount (String accNum,double balance,boolean accType,int maxTransaction, double overdraftLimit){
		super(accNum , balance , accType ,maxTransaction );
		this.overdraftLimit = overdraftLimit;
	}
	//add this method or not??
	public String withdraw(double amount) {
        if (balance + overdraftLimit - amount >= 0) {
            balance -= amount;
            return "Withdrawal successful. New balance: " + balance;
        } else {
            return "Insufficient funds. Withdrawal not allowed.";
        }
    }
	public String withDrawLimit() {
		if ( overdraftLimit > 0 )
			return "This account has an overdraft limit of: "+ overdraftLimit ;
		
		 return "This account does not have an overdraft limit" ;
	}
	
	public String toString() {
		return super.toString()+"\nOverdraft limit is: "+overdraftLimit ;
	}

}
