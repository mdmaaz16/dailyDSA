

class evenlydivisible {
    static int evenlyDivides(int n) {
        // code here
        int n1=n;
        int c=0;
        while(n>0){
            int r = n%10;
            if(r!=0 && n1%r==0){
                c++;
            }
            n/=10;
        }
        return c;
    }
}