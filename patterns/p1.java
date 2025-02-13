package patterns;
/*
*****
*****
*****
*****
*****
 */

class p1{
    static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] ar){
        int n = 5;
        printPattern(n);
    }
}