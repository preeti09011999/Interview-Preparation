import java.util.*;
public class prefixalsosuffix {
    public static void main(String[] args) {
        String pat = "ABABCABAB";
        kmp(pat);
     }
     
     public static void kmp(String pat){
         int lps[] = new int[pat.length()+1];
         int j = 0;
         int i = 1;
         while(i<pat.length()){
             if(pat.charAt(i) == pat.charAt(j)){
                 j++;
                 lps[i] = j;
                 i++;
             }
             else{
                 if(j == 0){
                     lps[i++] = j;
                 }
                 else{
                     j = lps[j-1];
                 }
             }
         }
        for(i=0;i<pat.length();i++) System.out.println(lps[i]);
     } 
}
