class AvgArray
 {
    public static void main(String[] args)
    {
        int[] arr = {18, 25, 7, 42, 15};
        int Avg =0;
        int Sum = 0;

        for(int i = 0; i < arr.length;i++)
        {
            Sum = Sum+arr[i];
            
        }
        Avg = Sum/arr.length;

        System.out.println(Avg);
        
    }
    
}
