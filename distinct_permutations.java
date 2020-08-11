class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> sol = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        pu(nums,sol,res,0,vis);
        return res;
    }
    
    public static void pu(int[] nums,List<Integer> sol,List<List<Integer>> res,int count,boolean vis[]){
        if(count == nums.length){
            ArrayList<Integer> ans = new ArrayList<>(sol);
            res.add(ans);
        }
        int prev = (int)-10e8;
        for(int i=0;i<nums.length;i++){
            if(!vis[i] && prev!=nums[i]){
                vis[i] = true;
                sol.add(nums[i]);
                pu(nums,sol,res,count+1,vis);
                sol.remove(sol.size()-1);
                prev = nums[i];
                vis[i] = false;
            }
        }
    } 
}
