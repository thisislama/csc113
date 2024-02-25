package project113;

public class Customer {// by lama 
	private String customerID ;
	private String name ;
	private String DOB ;
	// Account[] accounts;
	
	Customer (String cID , String name , String dob ){
		customerID = cID ;
		this.name = name;
		DOB = dob;
	}
	/*public Account[] selectAccount() {

	}*/

	public String toString() {
	return "Customer ID= "+customerID+"\nName= "+name+"\nDate of Birth= "+DOB ;
	}
}