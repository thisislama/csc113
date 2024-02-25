package project113;

//not finished missing 2 methods (validatePIN , displayMenu)
public class ATM{ // ATM class added comment
private int ATMName;
private String location ;
private String branchCode ; 
private Customer[] CustomerList;
private int numOfCustomer;

public ATM(int ATMName , String location ,String branchCode,int size){
this.ATMName= ATMName ;
this.location= location ;
this.branchCode= branchCode ;
CustomerList=new Customer[size];
numOfCustomer=0;
}
public Customer[] getCustomers() {
        return CustomerList;
    }

    public boolean addCustomer(Customer customer) {
        if (numOfCustomer >= CustomerList.length) 
          return false;  
          else
        CustomerList[numOfCustomer++] = customer;
        return true;
        
    }

    public boolean removeCustomer(int customerID) {
        for (int i = 0; i < numOfCustomer; i++) 
            if (CustomerList[i].getCustomerID() == atmID) {
                CustomerList[i] = CustomerList[numOfCustomer - 1];
                CustomerList[--numOfCustomer] = null;
                return true;
        }
        return false;
    }

    public ATM searchCustomer(int customerID) {
        for (int i = 0; i < numOfCustomer; i++) 
            if (CustomerList[i].getCustomerID() == customerID) 
                return CustomerList[i];
            
        
        return null;
    }

public boolean validatePIN(String PIN) {
    
}

public void displayMenu() {
System.out.println("1.Deposit \n2.withdrawal \n3.Check balance") ;
}
public String toString(){
 String result= "Atm Name= "+ATMName+"\nlocation= "+location+"\nBrach Code= "+branchCode;
 if(numOfCustomer>0){
       result+="Coustomer:\n";
       for(int i=0;i<numOfCustomer;i++)
           result+=CustomerList[i].toString()+"\n";
     
   }
   return result;
}

}
