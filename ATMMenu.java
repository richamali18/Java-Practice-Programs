import java.util.Scanner;

class ATMMenu 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("==== ATM MENU ==== ");
        System.out.println("1.Check Balance : ");
        System.out.println("2.Deposit : ");
        System.out.println("3.Withdraw : ");
        System.out.println("4.Exit : ");

        System.out.println("Enter your choice : ");
        int  choice = sobj.nextInt();

        int balance = 10000;


        switch (choice)
        {
            case 1:
                System.out.println("Your Balance is "+ balance);
                break;
            
            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sobj.nextInt();

                if(deposit >0){
                        balance = balance + deposit;

                        System.out.println("Amount Deposited Successfully");
                        System.out.println("Your balance is :" + balance);
                }
                else{
                        System.out.println("Invalid Deposit amount");
                    }
                        break;
                    
            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sobj.nextInt();
                    
                if (withdraw <= 0) {
                    System.out.println("Invalid Withdrawal Amount");

                } 
                else if(withdraw <= balance)
                    {
                        balance = balance - withdraw;
                        System.out.println("Amount Withdrawn Successfully");
                        System.out.println("Remaining Balance = " + balance);
                    }
                 else
                    {
                        System.out.println("Insufficient Balance");
                    }
        

                        break;
                    
            case 4:
                System.out.println("Thank you for using our ATM.");
                break; 
                
            default:
                    System.out.println("Invalid choice");

           
            
        }
        
    } 
    
}
