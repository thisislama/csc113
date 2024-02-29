package project113;
import java.util.*;

public class Customer { 

   static Scanner in = new Scanner(System.in); 
   private int customerID ;
   private String name ;
   private String DOB ;
   public Account[] accounts;
   private int numOfAccounts ;
	
   Customer (int cID , String name , String dob){
      customerID = cID ;
      this.name = name;
      DOB = dob;
      accounts = new Account[2];	
      numOfAccounts=0;
	  System.out.println("customer added successfully");
   }

   public Account selectAccount(){
      if (accounts != null && accounts.length > 0){// first if		
         System.out.println("Select which account you want ");
         System.out.println("1- first account"+ accounts[0]);
         System.out.println("2- second account"+ accounts[1]);
         int opt = in.nextInt();
      
         switch (opt) { //opt cases
            case 1:
               return accounts[0];
            case 2 :
               return accounts[1];
            default:
               System.out.println("Invalid input.");
         }	// cases end
      } else 
         System.out.println("You don't have accounts to select. ");
      return null;
       // else end
   }// method end


   public boolean addAccount(Account account) {//done
      if(numOfAccounts<accounts.length)
      {
         if(account instanceof CurrentAccount)
            accounts[numOfAccounts++]=new CurrentAccount((CurrentAccount)account);
         else
            if(account instanceof SavingAccount)
               accounts[numOfAccounts++]=new SavingAccount((SavingAccount)account);
      
         return true;
      }
      return false;
   }
	
   public String getName(){
      return name;
   }
   public int getCustomerID(){
      return customerID;
   }
   public Account[] getAccounts(){
      return accounts;
   }

   public String toString() {
      return "Customer ID= "+customerID+"\nName= "+name+"\nDate of Birth= "+DOB ;
   }
}