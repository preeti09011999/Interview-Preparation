class Solution {
    public int[] sortedSquares(int[] A) {
        if(A.length == 0) return A;
        int i=0,j=A.length-1;
        int idx = A.length-1;
        int ans[] = new int[A.length];
        while(idx>=0){
            if((A[i]*A[i]) < (A[j]*A[j])){
                ans[idx--] = A[j]*A[j];
                j--;
            }else{
                ans[idx--] = A[i]*A[i];
                i++;
            }
        }
        return ans;
    }
}
