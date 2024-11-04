
class equilbriumsum{
    public static void main(String[] ar){
        int a[] = {1,3,5,2,2};
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        left[0]=a[0];
        right[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            left[i]=a[i]+left[i-1];
        }
        for(int i=a.length-2;i>=0;i--){
            right[i]=a[i]+right[i+1];
        }
        for(int i=0;i<a.length;i++){
            if(left[i]==right[i]){
                System.out.print(i);
            }
        }
    }
}