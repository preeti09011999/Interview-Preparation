class Solution {
    public int subarraysDivByK(int[] A, int k) {
        if(A.length == 0) return 0;
        int sum = 0,count=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int ele : A){
            sum += ele;
            int val = (sum % k + k) % k;
            if(hm.containsKey(val)){
                count += hm.get(val);
            }
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        return count;
    }
}
