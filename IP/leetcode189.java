class Solution {
    public void rotate(int[] nums, int k) {
        if(k<0) k = k+nums.length;
        if(k>nums.length) k = k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    
    public void reverse(int[] nums,int sp,int ep){
        while(sp<ep){
            int temp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = temp;
            sp++;
            ep--;
        }
    }
}
