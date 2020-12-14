class Solution {
    public int maxSizeSlices(int[] slices) {
        if(slices.length < 3) return 0;
        if(slices.length == 3) return Math.max(slices[0], Math.max(slices[1], slices[2]));
        // include
        int n = slices.length;
        int a[] = new int[n-3];
        int b[] = new int[n-1];
        for(int i = 0 ; i < n; i++){
            if(i >= 1){
                b[i - 1] = slices[i];
            }
            
            if(i >= 2 && i <= n - 2){
                a[i - 2] = slices[i];
            }
        }
        int inc = maxSum(a, n/3-1) + slices[0];
        // exclude
        int exc = maxSum(b,n/3);
        return Math.max(inc, exc);
        
    }
    
    public int maxSum(int arr[], int k){
        int n = arr.length;
        int[][] inc = new int[n][k + 1];
        int[][] exc = new int[n][k + 1];
        
        for(int j = 1 ; j <= k; j++){
            for(int i = 0 ; i < n; i++){
                if(i == 0){
                    inc[i][j] = arr[i];
                    exc[i][j] = 0;
                }else{
                    inc[i][j] = arr[i] + exc[i - 1][j - 1];
                    exc[i][j] = Math.max(inc[i - 1][j], exc[i - 1][j]);
                }
            }
        }
        return Math.max(inc[n-1][k], exc[n-1][k]);
    }
}
