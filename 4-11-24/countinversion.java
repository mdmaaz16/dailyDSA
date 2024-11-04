import java.util.*;
class countinversion {
    static int mergeSort(int a[],int low,int high){
        int c = 0; // Initialize count of inversions
        if (low < high) {
            int mid = (low + high) / 2; // Calculate mid index
            c += mergeSort(a, low, mid); // Sort and count inversions in the left half
            c += mergeSort(a, mid + 1, high); // Sort and count inversions in the right half
            c += merge(a, low, mid, high); // Merge and count inversions
        }
        return c;
    }
    static int merge(int a[],int l,int m,int h){
        int left=l;
        int right=m+1;
        int c=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(left<=m && right<=h){
            if(a[left]<=a[right]){
                arr.add(a[left]);
                left++;
            }
            else{
                arr.add(a[right]);
                right++;
                c+=(m-left+1);
            }
        }
        while(left<=m){
            arr.add(a[left]);
            left++;
        }
        while(right<=h){
            arr.add(a[right]);
            right++;
        }
        for(int i=0;i<arr.size();i++){
            a[l+i]=arr.get(i);
        }
        return c;
        
    }
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int c = mergeSort(arr,0,arr.length-1);
        return c;
    }
}