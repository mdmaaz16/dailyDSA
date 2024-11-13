
class upperlowercon 
{ 
    String to_upper(String str) 
    { 
        // code here
        // String result = str.toUpperCase();
        // return result;(
        StringBuilder sb = new StringBuilder(); 
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                sb.append((char)(str.charAt(i)-32));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
} 