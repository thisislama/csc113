package project113;

public class CurrentAccount extends Account{
   private double overdraftLimit ; 
	
   CurrentAccount (int accNum,char accType,int pin,int maxTransaction, double overdraftLimit){
      super(accNum ,pin,maxTransaction );
      this.overdraftLimit = overdraftLimit;
   }

   public CurrentAccount(CurrentAccount current) {
      super(current); // Call the superclass's copy constructor
      this.overdraftLimit = current.overdraftLimit;
   }
	
   public String CheckAccountType(){
      return "Current Account";
   }
   public String withdraw(double amount) {
      if (balance + overdraftLimit - amount >= 0) {
         balance -= amount;
         return "Withdrawal successful. New balance: " + balance;
      } else {
         return "Withdrawal not allowed.";
      }
   }
   public String toString() { 
      return super.toString()+"\nOverdraft limit is: "+overdraftLimit ;
   }

}

