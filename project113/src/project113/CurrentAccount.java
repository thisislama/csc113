package project113;

public class CurrentAccount extends Account{
	private double overdraftLimit ; 
	
	CurrentAccount (String accNum,double balance,boolean accType,int maxTransaction, double overdraftLimit){
		super(accNum , balance , accType ,maxTransaction );
		this.overdraftLimit = overdraftLimit;
	}
	
	public String withDrawLimit() {
		
		 return "Withdrawal limit: $" ;
	}

}
