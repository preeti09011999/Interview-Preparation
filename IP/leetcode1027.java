class Solution {
    public int longestArithSeqLength(int[] A) {
        if(A.length == 0) return 0;
        HashMap<Integer, Integer> dp[] = new HashMap[A.length];
        for(int i=0;i<A.length;i++) dp[i] = new HashMap<>();
        int len = 0;
        for(int i=0;i<A.length;i++){
            for(int j=i-1;j>=0;j--){
                int diff = A[i] - A[j];
                int curr = dp[i].getOrDefault(diff,0);
                int newl = dp[j].getOrDefault(diff,1) + 1;
                dp[i].put(diff,Math.max(curr,newl));
                len = Math.max(len, dp[i].get(diff));
            }
        }
        return len;
    }
}
