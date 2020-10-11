class Solution {
    public int maxProduct(int[] nums) {
        int max_overall = nums[0];
        int max_end = nums[0], min_end = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = max_end;
            max_end = Math.max(nums[i],Math.max(nums[i]*max_end, nums[i]*min_end));
            min_end = Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*min_end));
            max_overall = Math.max(max_overall, max_end);
        }
        
        return max_overall;
    }
}
