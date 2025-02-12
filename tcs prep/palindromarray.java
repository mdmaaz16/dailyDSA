
class palindromarray {
    static boolean isPalindrome(int n){
        int n1=n;
        int s=0;
        while(n>0){
            int r = n%10;
            s = s*10+r;
            n/=10;
        }
        if(s==n1){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean palinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }
}
