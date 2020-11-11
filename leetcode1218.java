class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        if(arr.length == 0) return 0;
        int len = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele: arr){
            hm.put(ele, hm.getOrDefault(ele-difference, 0) + 1);
            len = Math.max(len, hm.get(ele));
        }
        return len;
    }
}
