import java.util.Scanner;

class Student2
{
    String name;
    String email;
    String phone;
    String address;

}
class Student
{
 public static void main(String[] args) 
 {
    Scanner sobj = new Scanner(System.in);

    Student2 sobj1 = new Student2();

    System.out.println("Enter Student's name : ");
     sobj1.name = sobj.nextLine();

    System.out.println("Enter Student's email : ");
    sobj1.email = sobj.nextLine();

    System.out.println("Enter Student's phone number  : ");
    sobj1.phone = sobj.nextLine();

    System.out.println("Enter Student's address : ");
    sobj1.address = sobj.nextLine();

    boolean details = true;

    if(details)
    {
        System.out.println("Check your details to confirm");
    }
    

    System.out.println("Your details are :"+ sobj1.name +","+ sobj1.email+ "," + sobj1.phone +","+ sobj1.address);

    if(details == true)
    {
        System.out.println("To save your detils please say yes or no :");
    }

    String choice = sobj.nextLine();

    if(choice.equalsIgnoreCase("Yes"))
    {
        System.out.println("Your details are saved successfully");
    }
    else if(choice.equalsIgnoreCase("No"))
    {
        System.out.println("Please re-entered your details");
    }
    else
    {
        System.out.println("Invalid choice. Please enter yes or no.");
    }
    


    
 }
}