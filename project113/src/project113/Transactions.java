package project113;
import java.time.LocalDateTime;//to get current time

public class Transactions {
   private int transactionID; //refrence on the invoice 
   private double Amount; //take it from Account
   private String transType;
   private LocalDateTime Date; //time getting back

   public Transactions (int id,double amount,String date){ //need to fix
      transactionID=id;   
      Amount=amount;
      Date=date;
   }

   public Transactions(String transType , LocalDateTime time ){
      this.transType=transType;
      Date = time;
   }
   public String invoice(){
      String result = "--------------------------------------------\n" +
                    "              ATM TRANSACTION               \n" +
                    "--------------------------------------------\n" +
                    "Transaction ID : " + transactionID + "\n" +
                    "Transaction : "+transType+"\n"+
                    "Amount : " + Amount + "\n" +
                    "Date : " + Date + "\n" +
                    "--------------------------------------------\n";
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


