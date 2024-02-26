package project113;

public class SavingAccount extends Account {
private double intresetRate;

public SavingAccount(String accNum,double balance,boolean accType,int maxTransaction, double intresetRate) {
super(accNum,balance,accType, maxTransaction) ;
this.intresetRate= intresetRate ;
}
public String CheckAccountType(){//polymorphism method applied 
return "Saving Account"
}
public void calculateInterest(){
double intreset=balance*intresetRate;
balance+=intreset;
System.out.println("Intreset calculated and added to the balance");
}
public String withdraw(double amount) {//polymorphism method applied 
        if (balance >= amount) {
            balance -= amount;
            return "Withdrawal successful. New balance: " + balance;
        } else {
            return "Withdrawal not allowed.";
        }
    }
    //delet withDrawLimit??
public String withDrawLimit(){ //polymorphism method applied 
//why transaction is not in array ??
double transcationAmount= transcation.getAmount();

if(transcationAmount <= balance){
balance-= transactionAmount;
System.out.println("Withdrawal successful. Remaining balance: "+balance);}

else
System.out.println("Insufficient funds");
}

public String toString(){
return super.toString()+"\nintreset Rate= "+intresetRate ;
}


}

