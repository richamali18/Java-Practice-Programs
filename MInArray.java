class MInArray
{
    public static void main(String[] args)
    {
        int arr[] = {25,10,40,5,30};
        int min = arr[0];

        
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] <min)
            {
                min = arr[i];
            }
            
    }
    System.out.println(min);
}
}