import java.util.Scanner;

class voting
{
    public static void main(String [] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sobj.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible for the voting");
        }
        else
        {
            System.out.println("You are not eligible");
        }

    }
}