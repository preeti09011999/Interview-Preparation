public class Solution {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        int ans[] = new int[length];
        for(int i=0;i<updates.length;i++){
            int si = updates[i][0];
            int ei = updates[i][1];
            int val = updates[i][2];
            ans[si] += val;
            if(ei+1 < length) ans[ei+1] += -val;
        }
        for(int i=1;i<length;i++){
            ans[i] += ans[i-1];
        }
        return ans;
    }
}
