public class greatestof2 {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            return "lesser";
        }
        else if(m==n){
            return "equal";
        }
        else{
            return "greater";
        }
    }
    public static void mainn(String[] ar){
        System.out.println(compareNM(3,4));
    }
}
