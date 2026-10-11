import java.util.Scanner;

class prob
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your bill amount");
        int bill = sobj.nextInt();

        if(bill > 1000)
        {
            System.out.println("Big spender!You get a free gift");
        }
        System.out.println("Thank you for the shopping");
    }
}