import java.util.Scanner;

class LinearSearch1 
{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    

    int[] arr = {5,10,15,20,25};

    System.out.println("Number to search : ");
    int search= sc.nextInt();

    boolean found = false;

    for(int i = 0; i < arr.length;i++)
    {
        if(arr[i] == search)
        {
            found = true;
            break;
        }
    }
    if(found)
    {
        System.out.println("Element found");
    }
    else
    {
        System.out.println("Not Found");
    }
    sc.close();
    
}
}
