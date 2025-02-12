public class sizeof {
    static int dataTypeSize(String str) {
        // code here
        if(str.charAt(0)=='C'){
            return Character.BYTES;
        }
        else if(str.charAt(0)=='I'){
            return Integer.BYTES;
        }
        else if(str.charAt(0)=='L'){
            return Long.BYTES;
        }
        else if(str.charAt(0)=='F'){
            return Float.BYTES;
        }
        else{
            return Double.BYTES;
        }
    }
    public static void main(String[] args) {
        System.out.print(dataTypeSize("Character"));
    }
}
