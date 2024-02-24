package project113;

public class Transactions {
	  private String transactionID;
	  private double Amount;
	  private String Date;
	  private String AccountNo;
	  public Transactions (String id,double amount,String date,String accountNo){
	   transactionID=id;   
	     Amount=amount;
	     Date=date;
	     AccountNo=accountNo;
	  }
	  public void invoice(){
	      System.out.println("Transaction ID : "+transactionID);
	      System.out.println("Amount : "+Amount);
	      System.out.println("Date : "+Date);
	      System.out.println("Account Number : "+AccountNo);
	  }
	    
	  }


