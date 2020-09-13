class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        Integer val1 = nums[0],val2 = -1;
        int count1 = 1,count2=0,i=1;
        while(i<nums.length){
            if(nums[i] == val1){
                count1++;
            }
            else if(nums[i] == val2){
                count2++;
            }
            else if(count1 == 0){
                val1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                val2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
            i++;
        }
        List<Integer> res = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int n:nums){
            if(val1 != null && n == val1)count1++;
            if(val2 != null && n == val2) count2++;
        }
        if(count1 > nums.length/3) res.add(val1);
        if(count2 > nums.length/3) res.add(val2);
        return res;
    }
}
