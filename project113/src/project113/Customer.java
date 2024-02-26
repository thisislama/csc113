package project113;
import java.util.*; 

public class Customer { 

	static Scanner in = new Scanner(System.in); 
	private int customerID ;
	private String name ;
	private String DOB ;
	private Account[] accounts;
	 private int numOfAccounts ;
	
	Customer (int cID , String name , String dob , int numAcc){
		customerID = cID ;
		this.name = name;
		DOB = dob;
		accounts = new Account[numAcc];	
		numOfAccounts=0;
	}

	public Account selectAccount(){
if (accounts != null && accounts.length > 0){// first if		
	    System.out.println("Select which account you want ");
		System.out.println("1- first account"+ accounts[0]);
		System.out.println("2- second account"+ accounts[1]);
		int opt = in.nextInt();

		switch (opt) { //opt cases
			case 1:
				return accounts[0];
				break;
				case 2 :
				return accounts[1];
				break;
				default:
				return "Invalid input.";
		}	// cases end
	} else {
		System.out.println("You don't have accounts to select. ");
		return null;
	} // else end
}// method end


	public void addAccount(Account account) {//done
		 if(numOfAccounts<accounts.length)//
		 accounts[numOfAccounts++]=new Account(account);//add this, since its composition so we add new 
		 else
		     System.out.println("Maximum account limit reach");
		 }
	
	public int getCustomerID(){
		return customerID;
	}


	public String toString() {
	return "Customer ID= "+customerID+"\nName= "+name+"\nDate of Birth= "+DOB ;
	}
}






