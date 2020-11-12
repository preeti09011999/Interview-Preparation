class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() == 0 && B.length() == 0) return true;
        if(A.length() == 0 || B.length() == 0 || (A.length() != B.length())) return false;
        int n = A.length();
        for(int i=0;i<n;i++){
            String ans = rotate(A,i);
            if(ans.equals(B)) return true;
        }
        return false;
    }
    
    
    public String rotate(String A, int k){
        String ans = "";
        ans += A.substring(k+1);
        ans += A.substring(0,k+1);
        return ans;
    }
}
