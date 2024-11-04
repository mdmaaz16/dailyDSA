
class transitionppoint {
    int transitionPoint(int arr[]) {
        // code here
        if(arr[0]==1){
            return 0;
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}