class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int prevalidcount = 0, ans = 0;
        int j = 0;
        for(int i=0;i<A.length;i++){
            if(L<=A[i] && A[i] <= R){
                ans += (i-j+1);
                prevalidcount = (i-j+1);
            }
            else if(A[i]<L){
                ans += prevalidcount;
            }else if(R<A[i]){
                j = i+1;
                prevalidcount = 0;
            }
        }
        return ans;
    }
}
