class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            
            int comp = target - nums[i];
            if(hm.containsKey(comp)){
                arr[0] = hm.get(comp); 
                arr[1] = i;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}
