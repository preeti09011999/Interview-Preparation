class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i=0,j=0;
        while(j<A.length){
            if(A[j]%2!=0) j++;
            else{
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j++;
            }
        }
        return A;
    }
}
