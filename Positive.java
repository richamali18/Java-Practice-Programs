import java.util.Scanner;

class Positive
{
    public static void main(String []args )
    {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        num= sc.nextInt();

       

       if(num > 0)
       {
        System.out.println("Positive number");
       }
       else if(num < 0)
       {
        System.out.println("Negative number");
       }
       else
       {
        System.out.println("Number is zero");

       }
    }
}