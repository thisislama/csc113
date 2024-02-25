package project113;

public class SavingAccount extends Account {
private double intresetRate;

public SavingAccount(double intresetRate) {
super(accNum ,accType ,balance,maxTransaction) ;
this.intresetRate= intresetRate ;
}

public String withDrawLimit(){
double transcationAmount= transcation.getAmount();

if(transactionAmount<= balance){
balance-= transactionAmount;
System.out.println("Withdrawal successful. Remaining balance: "+balance);}

else
System.out.println("Insufficient funds");
}

public String toString(){
return super.toString()+"\nintreset Rate= "+intresetRate ;
}


}
}
