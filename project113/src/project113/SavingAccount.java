package project113;

public class SavingAccount extends Account {
   private double intresetRate;

   public SavingAccount(int accNum,char accType,int pin,int maxTransaction, double intresetRate) {
      super(accNum,accType,pin, maxTransaction) ;
      this.intresetRate= intresetRate ;
   }
   public SavingAccount(SavingAccount saving) {
      super(saving); // Call the superclass's copy constructor
      intresetRate = saving.intresetRate;
   }
   public String CheckAccountType(){//polymorphism method applied
      return "Saving Account";
   }
   public double calculateInterest(){
      double intreset=balance*(intresetRate/100.0);
      return intreset;
   }
   public String withdraw(double amount) {//polymorphism method applied 
      if (balance >= amount) {
         balance -= amount;
         return "Withdrawal successful. New balance: " + balance;
      } else {
         return "Withdrawal not allowed.";
      }
   }
   public String toString(){
      return super.toString()+"\nintreset earned= "+calculateInterest() ;
   }


}


