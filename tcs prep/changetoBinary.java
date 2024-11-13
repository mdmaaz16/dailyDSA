// package tcs prep;


class changetoBinary{
    static String getBinaryRep(int N){
        // code here
       StringBuilder sb = new StringBuilder();

        // Convert N to binary and store in reverse order
        while (N > 0) {
            int r = N % 2;
            sb.append(r);
            N /= 2;
        }
        
        // Reverse the binary string to correct order
        sb.reverse();
        
        // Pad the result with leading zeros to ensure it has 30 bits
        while (sb.length() < 30) {
            sb.insert(0, '0');
        }

        return sb.toString();
    }
}
