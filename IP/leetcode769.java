class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        while(idx<arr.length){
            max = Math.max(max,arr[idx]);
            if(max == idx) ans++;
            idx++;
        }
        return ans;
    }
}
