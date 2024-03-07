import java.util.*; 
import java.time.LocalDateTime;//to get current time

public class ATMsjava{
   static Scanner in = new Scanner(System.in);
       
   public static void main(String[] args) {
      ATM atm=new ATM("QuickTeller ATM" , "Located in Riyadh" , "RYD001", 50000);  
    
      boolean start = true;
      
      while (start) {
         System.out.println("Welcome to the ATM system!");
         System.out.println("1. Log in");
         System.out.println("2. Sign up");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
         int choice = in.nextInt();
         
         switch (choice) {
            case 1:
               Customer foundCustomer;
               boolean loggedIn = false; 
               do { 
                  System.out.println("Please enter your Customer ID:"); 
                  int id = in.nextInt(); 
               
               // Search for the customer and return the object 
                  foundCustomer = atm.searchCustomer(id); 
               
                  if (foundCustomer != null) { 
                     boolean validPIN = false;
                     do { 
                        System.out.println("Please enter your PIN:"); 
                        int pin = in.nextInt(); 
                     
                     // Validate the PIN 
                        if (atm.validatePIN(pin, foundCustomer)) { 
                           System.out.println("You have successfully logged in. Welcome, " + foundCustomer.getName()); 
                           validPIN = true; 
                           loggedIn = true; 
                        } else { 
                           System.out.println("Invalid PIN. Please try again."); 
                        } 
                     } while (!validPIN); // Repeat until a valid PIN is entered 
                  } else { 
                     System.out.println("Invalid Account ID. Please try again."); 
                  } 
               } while (!loggedIn); // Repeat until the user successfully logs in 
                  
               Account account = foundCustomer.selectAccount();
               if (account == null) {
                  System.out.println("No accounts found for the customer.");
               }
               else
               {
                  boolean logged = true;
                  while (loggedIn) {
                     System.out.println("1. Deposit");
                     System.out.println("2. Withdraw");
                     System.out.println("3. Check Balance");
                     System.out.println("4. Logout");
                     System.out.print("Enter your choice: ");
                     int option = in.nextInt();
                  
                     switch (option) {
                        case 1:
                           System.out.print("Enter the amount to deposit: ");
                           double depositAmount = in.nextDouble();
                           String deposit = account.deposit(depositAmount);
                           System.out.println(deposit);
                            //by lama 
                           Transactions trans1 = new Transactions("Deposit",depositAmount,LocalDateTime.now());
                           account.addTransaction(trans1);
                           //by lama
                           break;
                        case 2:
                           System.out.print("Enter the amount to withdraw: ");
                           double withdrawAmount = in.nextDouble();
                           String withdraw = account.withdraw(withdrawAmount);
                           System.out.println(withdraw);
                           //by lama 
                           Transactions trans2 = new Transactions("Withdraw",withdrawAmount,LocalDateTime.now());
                           account.addTransaction(trans2);
                           //by lama
                           break;
                        case 3:
                           account.checkBalance();
                            //by lama 
                           Transactions trans3 = new Transactions("Check Balance",0,LocalDateTime.now());
                           account.addTransaction(trans1);
                           //by lama
                           break;
                        case 4:
                           logged = false;
                           System.out.println("Logged out successfully.");
                           break;
                        default:
                           System.out.println("Invalid choice. Please try again.");
                           break;}
                  }//while loop end
               } //else end line 56
               break; //log in case end ..
               
            case 2://sign up case
               int cID;
               do{
                  System.out.println("Enter your customer ID (between 10000000 and 99999999)");
                  cID=in.nextInt();
               
                  if(cID>=10000000 && cID<=99999999)
                     System.out.println("Invalid customer ID, pleas try again");
               }while(cID>=10000000 && cID<=99999999);
               System.out.println("Enter your name");
               in.next();
               String name=in.nextLine();
               System.out.println("Enter your date of birth");
               in.next();
               String dob=in.nextLine();
               Customer customer=new Customer (cID , name , dob);
               
               for (int i = 0; i < 2; i++) {
                  System.out.print("Enter account number for account " + (i + 1) + ": ");
                  int accountNum = in.nextInt();  
               
                  System.out.print("Enter account type (s for saving, c for current) for account " + (i + 1) + ": ");
                  char accountType = in.next().charAt(0);
               
                  System.out.print("Enter PIN for account " + (i + 1) + ": ");
                  int pin = in.nextInt();
               //200 and 0.03 and 2000 we will change it in there classes
                  Account accountCreation;
                  if (accountType == 's') {
                     accountCreation = new SavingAccount( accountNum, pin, 200,  0.03);
                  } else if (accountType == 'c') {
                     accountCreation = new CurrentAccount( accountNum, pin, 200,  2000);
                  } else {
                     System.out.println("Invalid account type. Skipping account creation.");
                     continue;
                  }
               
                  customer.addAccount(accountCreation); //بيرجع صح او خطأ؟
               }//for loop end
               boolean added = atm.addCustomer(customer);
               if (added) {
                  System.out.println("Customer added successfully.");
               } else {
                  System.out.println("Failed to add customer. Maximum customer limit reached.");
               }
            
               
               break;
            case 3: //exit
               start = false;
               System.out.println("Thank you for using the ATM system. Goodbye!");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
               break;
         }
      }
   }}
