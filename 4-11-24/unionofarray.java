import java.util.*;
class unionofarray {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       Set<Integer> s = new HashSet<>();
       ArrayList<Integer> l = new ArrayList<>();
       for(int i=0;i<a.length;i++){
           s.add(a[i]);
       }
       for(int j=0;j<b.length;j++){
           s.add(b[j]);
       }
       for(Integer i:s){
           l.add(i);
       }
       Collections.sort(l);
       return l;
    }
}