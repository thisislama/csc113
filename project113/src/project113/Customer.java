package project113;
import java.util.*;
Static Scanner in = new Scanner(System.in);
public class Customer { 
	private int customerID ;
	private String name ;
	private String DOB ;
	 Account[] accounts;
	 private int numOfAccounts ;
	
	Customer (int cID , String name , String dob , int numAcc){
		customerID = cID ;
		this.name = name;
		DOB = dob;
		accounts = new Account[numAcc];	
		numOfAccounts=0;
	}
	

<<<<<<< HEAD
=======
<<<<<<< HEAD
	}*//add
	public int getCustomerID(){
		return customerID;
	}
=======
>>>>>>> ad66fb498617512155bb63d2b03874706ba45062
	public void addAccount(Account account) {
		 if(numOfAccounts<accounts.length)//
		 accounts[numOfAccounts++]=account;//add this
		 else
		     System.out.println("Maximum account limit reach");
		 }

public Account selectAccount() {
		if (accounts != null && accounts.length > 0){
			return list[0];
			System.out.println("is that your selected account? enter y or n");
		 char opt = in.nextChar();
		 while (opt == 'n'){
			int i =0;
			return list[i++];
			if (i >= accounts.length)
			System.exit(0);
			System.out.println("is that your selected account? enter y or n");
		 char opt = in.nextChar();
		 }
		}// if end
		else {
		System.out.println("You don't have accounts to select.");
		return null;
		}
}// error should return Account obj :)
	
	public int getCustomerID(){
		return customerID;
	}


	public String toString() {
	return "Customer ID= "+customerID+"\nName= "+name+"\nDate of Birth= "+DOB ;
	}
}
