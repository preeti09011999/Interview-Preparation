class Solution {
    public int numRabbits(int[] answers) {
        if(answers.length == 0) return 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int ele : answers){
            if(hm.containsKey(ele)){
                int val = hm.get(ele);
                hm.put(ele,val+1);
            } else{
                hm.put(ele,1);
            }
            if(hm.containsKey(ele)){
                if(hm.get(ele) == 1)
                    ans += ele + 1;
            }
            if(hm.containsKey(ele)){
                if(hm.get(ele) == ele + 1)
                    hm.remove(ele);
            }
        }
        return ans;
    }
}
