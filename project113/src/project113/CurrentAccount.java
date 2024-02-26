package project113;

public class CurrentAccount extends Account{
	private double overdraftLimit ; 
	
CurrentAccount (String accNum,double balance,boolean accType,int maxTransaction, double overdraftLimit){
		super(accNum , balance , accType ,maxTransaction );
		this.overdraftLimit = overdraftLimit;
	}//done 

	//add this method or not?? 
	public String withdraw(double amount) {
        if (balance + overdraftLimit - amount >= 0) {
            balance -= amount;
            return "Withdrawal successful. New balance: " + balance;
        } else {
            return "Insufficient funds. Withdrawal not allowed.";
        }
    }

/* public void transactionHistory(){
	
}*/

	public String withDrawLimit() { // done
		if ( overdraftLimit > 0 )
			return "This account has an overdraft limit of: "+ overdraftLimit ;
		
		 return "This account does not have an overdraft limit" ;// else
	}
	
	public String toString() { //done
		return super.toString()+"\nOverdraft limit is: "+overdraftLimit ;
	}

}
