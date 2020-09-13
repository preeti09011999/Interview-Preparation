class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int amt = 0;
        while(i!=j){
            if(height[i]<height[j]) amt = Math.max((j-i)*height[i++],amt);
            else amt = Math.max((j-i)*height[j--],amt);
        }
        return amt;
    }
}
