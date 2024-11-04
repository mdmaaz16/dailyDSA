class rotatek {
    static void rotateArray(int a[],int start,int end){
        while(start<=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        // int j;
        // for(int i=1;i<=d;i++){
        //     int temp=arr[0];
        //     for(j=0;j<arr.length-1;j++){
        //         arr[j]=arr[j+1];
        //     }
        //     arr[j]=temp;
        // }
        d=d%arr.length;
        rotateArray(arr,0,d-1);
        rotateArray(arr,d,arr.length-1);
        rotateArray(arr,0,arr.length-1);
    }
}
