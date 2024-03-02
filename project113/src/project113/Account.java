package project113;

	public abstract class Account {
		 protected int accountNum; // changed the modifier of the attributes to protected:)
		 protected double balance;
		 protected Transactions[] transaction;
		 protected int numOfTransaction;
		 protected int PIN;
		 
   public Account(int accNum,int pin,int maxTransaction){ //delete balance from constructor
      accountNum=accNum;
      balance=0;//changed
      PIN=pin;
      transaction=new Transactions[maxTransaction];
      numOfTransaction=0;
   }
   public Account(Account acc) {
      this.accountNum = acc.accountNum;
      this.balance = acc.balance;
      this.PIN = acc.PIN;
      this.transaction = new Transactions[acc.transaction.length];
      this.numOfTransaction = acc.numOfTransaction;
   }
   public void addTransaction(Transactions transaction){
      if(numOfTransaction<this.transaction.length)// add this
         this.transaction[numOfTransaction++]=transaction;//add this
      else
         System.out.println("Maximum transaction limit reach");
   }
   public void checkBalance(){
      System.out.println("Balance= "+balance);
   }
   public abstract String CheckAccountType();//polymorphism method
   public abstract String withdraw(double amount);//polymorphism method

   public String deposit(double amount) {
      if (amount <= 0) {
         return "Invalid deposit amount, Please enter a positive value.";
      } else {
         balance += amount;
         return "Deposit successful, New balance: " + balance;
      }
   }
   @Override
   	 public String toString(){
      String result = " account Number: "+accountNum+"\n balance: "+balance+"\n";
      if(transaction!=null){ 
         result+="Transactions:\n";
         for(int i=0;i<numOfTransaction;i++)
            result+=transaction[i].invoice();//
           
      }// if end 
      return result;
   }
   public int getPIN() {
      return PIN;
   }
   public double getBalance() {
      return balance;
   }
   public void setBalance(double balance) {
      this.balance = balance;
   }
}

