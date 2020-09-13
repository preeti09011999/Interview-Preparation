class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 1;
        int i = 1;
        while(i<nums.length){
            if(nums[i] != val){
                if(count != 0){
                    count--;
                    i++;
                }
                else if(count == 0){
                    val = nums[i];
                    count = 1;
                    i++;
                }
            }
            else{
                count++;
                i++;
            }
        }
        return val;
    }
}
