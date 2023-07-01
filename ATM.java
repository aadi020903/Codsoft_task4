import java.util.Scanner;


class ATM
 {
    float Balance;
    int PIN = 0001;

    public void checkpin()
    {
        System.out.println("ENTER PIN : ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);   
        int entPIN = sc.nextInt();
        if(entPIN ==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("PIN doesn't match Enter Again");
            System.out.println("");
        }
     }

     public void menu()
     {
        System.out.println("Enter your Choice :");
        System.out.println("1. CHECK A/C BALANCE");
        System.out.println("2. WITHDRAW MONEY");
        System.out.println("3. DEPOSIT MONEY");
        System.out.println("4. EXIT");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option==1)
        {
            checkBalance();
        }
        else if(option==2)
        {
            withdraw();
        }
        else if(option==3)
        {
            DepositAmmount();
        }
        else if(option==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter A Valid Choice No.");
            System.out.println("");;
        }
     }

     public void checkBalance()
     {
        System.out.println("BAlance :" + Balance);
        System.out.println("");;
        menu();
     }
     public void withdraw()
     {
        System.out.println("Enter Amount want to Withdraw");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();

        if(amt>Balance)
        {
            System.out.println("Insuffcient Balance to Withdraw");
            System.out.println("");
            menu();
        }
        else
        {
            Balance = Balance-amt;
            System.out.println("Withrwal Successfully!!");
            System.out.println("");
            menu();
        }
     }
     public void DepositAmmount()
     {
        System.out.println("Enter Amount : ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("");
        menu();
     }
 }
 class ATMmachine
 {
    
    public static void main(String[] args) 
    {
        ATM A = new ATM();
        A.checkpin();
    }
 }