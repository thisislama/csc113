package project113;

public class ATM{ // ATM class added comment
   private String ATMName;
   private String location ;
   private String branchCode ; 
   private Customer[] CustomerList;
   private int numOfCustomer;

   public ATM(String ATMName , String location ,String branchCode,int size){
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
         if (CustomerList[i].getCustomerID() == customerID) {
            CustomerList[i] = CustomerList[numOfCustomer - 1];
            CustomerList[--numOfCustomer] = null;
            return true;
         }
      return false;
   }

   public Customer searchCustomer(int customerID) {
      for (int i = 0; i < numOfCustomer; i++) 
         if (CustomerList[i].getCustomerID() == customerID) 
            return CustomerList[i];
            
      return null;
   }

   public boolean validatePIN(int PIN, Customer c) {
      Account[] accounts = c.getAccounts();
      for (int i=0;i<2;i++ )
         if (c.accounts[i].getPIN()== PIN)
         //if (C.getAccount().getPIN()== PIN) 
            return true ;
   
      return false;
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
