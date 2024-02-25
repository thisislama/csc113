package project113;

//not finished missing 2 methods (validatePIN , displayMenu)
public class ATM{
private int atmID;
private String location ;
private String branchCode ;

public ATM(int atmdID , String location ,String branchCode){
this.atmID= atmdID ;
this.location= location ;
this.branchCode= branchCode ;
}

public boolean validatePIN(String PIN) {

}

public void displayMenu() {
System.out.println("1.Deposit \n2.withdrawal \n3.Check balance") ;
}

public String toString(){
return "Atm ID= "+atmID+"\nlocation= "+location+"\nBrachCode= "+branchCode;
}

}
}
