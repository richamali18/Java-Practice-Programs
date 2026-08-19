import java.util.Scanner;

class GradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your marks:");

        int marks = sobj.nextInt();

        if(marks>100 || marks<=0)
        {
            System.out.println("Invalid marks");
        }
        if(marks >= 90 && marks <= 100)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75 && marks <= 89)
        {
            System.out.println("GRade B");
        }
        else if(marks >=60 && marks<=74)
        {
            System.out.println("GRade C");
        }
        else if(marks>=35 && marks<=59)
        {
            System.out.println("GRade D");
        }
        else if(marks<35)
        {
            System.out.println("Fail");
        }
    }
    
}
