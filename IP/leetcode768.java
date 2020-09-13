class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        int leftmax[] = new int[arr.length];
        int rightmin[] = new int[arr.length];
        rightmin[arr.length-1] = arr[arr.length-1];
        leftmax[0] = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>leftmax[i-1]) leftmax[i] = arr[i];
            else leftmax[i] = leftmax[i-1];
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<rightmin[i+1]) rightmin[i] = arr[i];
            else rightmin[i] = rightmin[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            if(leftmax[i]<=rightmin[i+1])ans++;
        }
        return ans+1;
    }
}
