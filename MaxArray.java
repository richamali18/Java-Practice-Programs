class MaxArray
 {
    public static void main(String[] args) 
    {
        int arr[]= {45,12,89,23,67};
        int iMax= 0;

        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i]>iMax)
            {
                iMax = arr[i];
            }
            
        }
        System.out.println("Maximum number is :"+iMax);

        
    }
    
}

    

