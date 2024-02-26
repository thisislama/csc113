package project113;

public class SavingAccount extends Account {
private double intresetRate;

public SavingAccount(String accNum,double balance,boolean accType,int maxTransaction, double intresetRate) {
super(accNum,balance,accType, maxTransaction) ;
this.intresetRate= intresetRate ;
}

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

