class rowwithmax1s {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=0;
        int ind=-1;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    c++;
                }
            }
            if(max<c){
                max=c;
                ind=i;
            }
        }
        return ind;
    }
}