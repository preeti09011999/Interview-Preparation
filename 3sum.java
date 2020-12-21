class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            List<List<Integer>> bans = new ArrayList<>();
            return bans;
        }
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int j = i+1;
                int k = nums.length-1;
                int sum = -nums[i];
                while(j<k){
                    if(nums[j]+nums[k] == sum){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while( j < k && nums[j] == nums[j+1]) j++;
                        while( j<k && nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(nums[j]+nums[k] > sum )k--;
                    else j++;
                }
            }
            
        }
        return ans;
    }
}
