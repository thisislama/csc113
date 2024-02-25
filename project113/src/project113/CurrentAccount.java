package project113;

public class CurrentAccount extends Account{
	private double overdraftLimit ; 
	
	CurrentAccount (String accNum,double balance,boolean accType,int maxTransaction, double overdraftLimit){
		super(accNum , balance , accType ,maxTransaction );
		this.overdraftLimit = overdraftLimit;
	}
	
	public String withDrawLimit() {
		if ( overdraftLimit > 0 )
			return "This account has an overdraft limit of: "+ overdraftLimit ;
		
		 return "This account does not have an overdraft limit" ;
	}

}
