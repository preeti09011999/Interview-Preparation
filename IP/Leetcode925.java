class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // if(name.length() == 0 || typed.length()  ==0) return false;
        int idx = 0,i=0;
        boolean res = true;
        while(i<name.length() && res == true && idx <typed.length()){
            
            if(name.charAt(i) == typed.charAt(idx)){
                i++;
                idx++;
            }
            else if(idx > 0 && (typed.charAt(idx) == typed.charAt(idx-1))){
                idx++;
            }
            else{
                res = false;
            }
        }  
        if(i!=name.length()) res = false;
        if(idx != typed.length()){
            char ch = name.charAt(name.length()-1);
            while(idx != typed.length()){
                if(typed.charAt(idx)!=ch){
                    res = false;
                    break;
                }
                idx++;
            }
        }
        return res;
    }
}
