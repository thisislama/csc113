package project113;
import java.time.LocalDateTime;//to get current time

public class Transactions {
   private int transactionID; //refrence on the invoice 
   private double Amount; //take it from Account
   private String transType;
   private LocalDateTime Date; //time getting back

   public Transactions (String tType,double amount,LocalDateTime time){ //
      //transactionID=0;// user don't enter   
      Amount=amount;//from deposit/withdraw amount
      Date=time;
   }

   public String invoice(){
      String result = "--------------------------------------------\n" +
                      "              ATM RECEIPT                   \n" +
                      "--------------------------------------------\n" +
                      "Transaction # : " + transactionID + "\n" +
                      "Transaction Type: "+transType+"\n"+
                      "Amount : " + Amount + "\n" +
                      "Date : " + Date + "\n" +
                      "--------------------------------------------\n"+
                      "         THANK YOU FOR USING OUR ATM        \n";
      return result;
   }
   public int getTransactionID() {
      return transactionID;
   }
   public void setTransactionID(int transactionID) {
      this.transactionID = transactionID;
   }
   public double getAmount() {
      return Amount;
   }
   public void setAmount(double amount) {
      Amount = amount;
   }
	    
}


