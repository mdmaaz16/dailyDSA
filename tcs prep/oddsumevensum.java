
class oddsumevensum
{
    public int[] find_sum(int n)
    {
        // Code here
        int a[] = new int[2];
        int oddsum=0;
        for(int i=1;i<=n;i+=2){
            oddsum+=i;
        }
        int evensum=0;
        for(int i=0;i<=n;i+=2){
            evensum+=i;
    }
    a[0] = oddsum;
    a[1] = evensum;
    return a;
}
}
