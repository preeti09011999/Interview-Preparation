class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int water = 0;
        for(int i=0;i<n;i++){
            while(st.size()!=0 && height[st.peek()] <= height[i]){
                int h = height[st.peek()];
                st.pop();
                if(st.size() == 0) break;
                int width = i - st.peek() - 1;
                int h1 = height[i];
                int h2 = height[st.peek()];
                int H = Math.min(h1,h2) - h;
                water += width * H;
            }
            st.push(i);
        }
        return water;
    }
}

// optimized code
class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        int n = height.length;
        int lmax = 0, rmax = 0, water = 0;
        int li = 0;
        int ri = n-1;
        while(li<ri){
            lmax = Math.max(lmax,height[li]);
            rmax = Math.max(rmax, height[ri]);
            if(lmax < rmax)
                water += lmax - height[li++];
            else water += rmax - height[ri--];
        }
        return water;
    }
}
