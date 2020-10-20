class Solution {
    public int findMaxLength(int[] nums) {
        
        int sum = 0,count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i] == 1 ? 1 : -1;
            if(hm.containsKey(sum)) count = Math.max(count, i-hm.get(sum));
            if(!hm.containsKey(sum)) hm.put(sum,i);
        }
        return count;
    }
}
