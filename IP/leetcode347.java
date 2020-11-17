class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return hm.get(a) - hm.get(b);
        });
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int val = hm.get(nums[i]);
                hm.put(nums[i],val+1);
            }
            else hm.put(nums[i],1);
        }
        for(int ele : hm.keySet()){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++) ans[i] = pq.remove();
        return ans;
    }
}
