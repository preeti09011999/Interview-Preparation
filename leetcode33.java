class Solution {
    public int search(int[] nums, int target) {
        int si = 0, ei = nums.length-1;
        while(si<=ei){
            int mid = (si+ei)>>1;
            if(nums[mid] == target) return mid;
            else if(nums[si] <= nums[mid]){
                if(nums[si] <= target && target < nums[mid]) ei = mid-1;
                else si = mid+1;
            }
            else{
                if(nums[mid] < target && nums[ei] >= target) si = mid+1;
                else ei = mid-1;
            }
        }
        return -1;
    }
}
