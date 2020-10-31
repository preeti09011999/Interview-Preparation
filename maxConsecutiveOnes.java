class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0) return 0;
        int curr = 0;
        int best = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i] == 0){
                if(curr > best){
                    best = curr;
                }
                curr = 0;
            }else{
                curr++;
            }
            i++;
        }
        if(curr > best) return curr;
        else return best;
    }
}
