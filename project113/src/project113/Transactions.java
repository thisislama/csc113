package project113;

public class Transactions {
	  private int transactionID;
	  private double Amount;
	  private String Date;
	  public Transactions (int id,double amount,String date,int accountNo){
	   transactionID=id;   
	     Amount=amount;
	     Date=date;
	     AccountNo=accountNo;
	  }
	  public void invoice(){
		  System.out.println("--------------------------------------------");
		  System.out.println("              ATM TRANSACTION               ");
		  System.out.println("--------------------------------------------");

	      System.out.println("Transaction ID : "+transactionID);
	      System.out.println("Amount : "+Amount);
	      System.out.println("Date : "+Date);
	      System.out.println("Account Number : "+AccountNo);
		  System.out.println("--------------------------------------------");

	  }
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	   
	    
	  }


