package project113;

public class SavingAccount extends Account {
private double intresetRate;

public SavingAccount(String accNum,double balance,boolean accType,int maxTransaction, double intresetRate) {
super(accNum,balance,accType, maxTransaction) ;
this.intresetRate= intresetRate ;
}
public SavingsAccount(SavingsAccount saving) {
        super(saving); // Call the superclass's copy constructor
        this.interestRate = saving.interestRate;
}
public String CheckAccountType(){//polymorphism method applied
return "Saving Account"
}
public void calculateInterest(){
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

