
class productofarray {

    public static int product(int arr[],int n)
    {
        int prod = 1;
        for(int i=0;i<n;i++){
            prod*=arr[i];
        }
        return prod;
    }
}
