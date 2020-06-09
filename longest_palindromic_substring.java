class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];
        int cd = 0;
        if(s.length()==0){
            return "";
        }
        else if(s.length()==1){
            return s;
        }else{
            for(int diag = 0;diag<s.length();diag++){
                int sp = 0;
                int ep = diag;
                while(ep<s.length()){
                    if(diag == 0){
                        dp[sp][ep] = true;
                        cd = diag;
                    }else if(diag == 1){
                        if(s.charAt(sp)==s.charAt(ep)){
                            dp[sp][ep] = true;
                            cd = diag;
                        }
                    }else{
                        if(s.charAt(sp)==s.charAt(ep)&&dp[sp+1][ep-1]==true){
                            dp[sp][ep] = true;
                            cd = diag;
                        }
                    }
                    ep++;
                    sp++;
                }
            }
        }
        int ii = 0, ei = 0;
        for(int i=0;i<s.length();i++){
            if(dp[i][cd]==true){
                ii = i;
                ei = cd;
                break;
            }else{
                cd++;
            }
        }
        String res = s.substring(ii,ei+1);
        return res;
    }
}