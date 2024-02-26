package project113;

public class Bank {
    private String BankName;
    private String Address;
    private String BranchCode;// pri 
    private ATM[] ATMList;
    private int numOfATMs;

    public Bank(String bankName, String address, String branchCode, int size) {
        BankName = bankName;
        Address = address;
        BranchCode = branchCode;
        ATMList = new ATM [size];
        numOfATMs = 0;
    }

    public ATM[] getATMs() {
        return ATMList;
    }

    public boolean addATM(ATM atm) {
        if (numOfATMs >= ATMList.length) 
          return false;  
          
        ATMList[numOfATMs++] = atm;
        return true;
        
    }

    public boolean removeATM(int atmID) {
        for (int i = 0; i < numOfATMs; i++) 
            if (ATMList[i].getAtmID() == atmID) {
                ATMList[i] = ATMList[numOfATMs - 1];
                ATMList[--numOfATMs] = null;
                return true;
        }
        return false;
    }

    public ATM searchATM(int atmID) {
        for (int i = 0; i < numOfATMs; i++) 
            if (atmList[i].getAtmID() == atmID) 
                return atmList[i];
            
        
        return null;
    }
    public String toString(){
   String result= " Bank Name: "+BankName+"\n Address: "+Address+"\n BranchCode: "+BranchCode+"\n" ;
   if(numOfATMs>0){
       result+="ATMs:\n";
       for(int i=0;i<numOfATMs;i++)
           result+=ATMList[i].toString()+"\n";
     
   }
   return result;
 }

}
}
