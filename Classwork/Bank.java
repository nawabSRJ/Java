import java.util.*;
class Bank {
    Scanner Sc = new Scanner(System.in);
    int count = 0;  // ? to keep track of the no. of customers
    int Savingaccounts[][] = new int[10][2];
    int TOTAL_ACC = 10;
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        Bank obj = new Bank();
        
        while(true)
        {
        System.out.println("Enter Your Choice : \n1->Open Account\n2->Close Account\n3->Access Account\n4->Exit");
        int choice = Sc.nextInt();
        switch(choice)
        {
            case 1: 
            obj.createAccount();
            break;

            case 2: 
            obj.CloseAccount();
            break;

            case 3:
            
            obj.AccessAccount();
            break;

            case 4: 
            System.exit(0);
            break;
   
        }

    }
        

    } // main ends

    void createAccount() {
        if (count >= TOTAL_ACC) {
            System.out.println("Sorry, we cannot accommodate more Customers");
            return;
        }
        
        int accId;
        boolean isDuplicate;
        do {
            System.out.println("Enter Account id : ");
            accId = Sc.nextInt();
            
            // * false || false -> terminates
            isDuplicate = (accId == 0) || isIdDuplicate(accId);
            
            if (isDuplicate) {
                System.out.println("Account Id is either 0 or already taken. Enter Again");
            }
        } while (isDuplicate);
        
        System.out.println("Enter the amount to deposit : ");
        int amt = Sc.nextInt();
        Savingaccounts[count][0] = accId;
        Savingaccounts[count][1] = amt;
        count++;    // To keep track of Bank Savingaccounts
    }
    
    boolean isIdDuplicate(int id) {
        for (int i = 0; i < count; i++) {
            if (Savingaccounts[i][0] == id) {
                return true; // ID already exists
            }
        }
        return false; // ID does not exist
    }
    

    void CloseAccount(){
        System.err.println("Enter the Account id : ");
        int accId = Sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i < Savingaccounts.length; i++)
        {
            if(accId == Savingaccounts[i][0])
            {
                found = true;
                Savingaccounts[i][0] = 0;
                Savingaccounts[i][1] = 0; 
            }
        }
        if(!found)
        {
            System.out.println("Sorry , account not found");
        }

    }

    void AccessAccount()
    {
        System.err.println("Enter the Account id : ");
        int accId = Sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i < Savingaccounts.length; i++)
        {
            if(accId == Savingaccounts[i][0])
            {
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("Sorry , account not found");
            return;
        }
        System.out.println("Enter the action to be performed :\n1->Deposit\n2->Withdrawl\n3->Balance Enquiry\n");
        int choice = Sc.nextInt();
        int amt;
        switch(choice)
        {

            case 1:
            System.out.println("Enter amount to be deposited:");
            amt = Sc.nextInt();
            for(int i = 0 ; i < Savingaccounts.length; i++)
            {
                if(accId == Savingaccounts[i][0])
                {
                    Savingaccounts[i][1] += amt;
                    System.out.println("Do you want to display balance?\n[yes -> 1/ no -> 0]");
                    int cho = Sc.nextInt();
                    if(cho == 1){
                        System.out.println("New Bank Balance : " + Savingaccounts[i][1]);
                    }


                    
                }
            }
            break;

            case 2:
            System.out.println("Enter Amount to withdraw :");
            amt = Sc.nextInt();
            for(int i = 0 ; i < Savingaccounts.length; i++)
            {
                if(accId == Savingaccounts[i][0])
                {
                    Savingaccounts[i][1] -= amt;
                    System.out.println("Do you want to display balance?\n[yes -> 1/ no -> 0]");
                    int cho = Sc.nextInt();
                    if(cho == 1){
                        System.out.println("New Bank Balance : " + Savingaccounts[i][1]);
                    }
                }
            }
            break;

            case 3:
                for(int i = 0 ; i < Savingaccounts.length; i++)
                {
                    if(accId == Savingaccounts[i][0])
                    {
                        System.out.println("Bank Balance : " + Savingaccounts[i][1]);
                    }
                }
            break;

            
        }
    }

}// class ends
