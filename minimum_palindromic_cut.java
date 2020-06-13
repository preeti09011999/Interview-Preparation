import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]){
        String str = "abccbc";
        boolean pdp[][] = new boolean[str.length()][str.length()];
        for(int diag = 0;diag<str.length();diag++){
            int si = 0;
            int ei = diag;
            while(ei<str.length()){
                if(diag == 0){
                    pdp[si][ei] = true;
                }
                else if(diag == 1){
                    pdp[si][ei] = str.charAt(si)==str.charAt(ei) ? true : false;
                }else{
                    if(str.charAt(si)==str.charAt(ei)&&pdp[si+1][ei-1] == true){
                        pdp[si][ei] = true;
                    }
                }
                
                ei++;
                si++;
            }
        }
        
        
        int mpc[][] = new int[str.length()][str.length()];
        
        for(int dia = 0;dia<str.length();dia++){
            int sp = 0;
            int ep = dia;
            while(ep<str.length()){
                if(dia == 0){
                    mpc[sp][ep] = 0;
                }else if(dia == 1){
                    mpc[sp][ep] = pdp[sp][ep]==true ? 0 : 1;
                }
                else{
                    if(pdp[sp][ep]==true){
                        mpc[sp][ep] = 0;
                    }else{
                        int cp = sp;
                        int mp = Integer.MAX_VALUE;
                        while(cp < ep){
                            if(mpc[sp][cp]+mpc[cp+1][ep] + 1<mp){
                                mp = mpc[sp][cp]+mpc[cp+1][ep] + 1;
                            }
                            cp++;
                        }
                        mpc[sp][ep] = mp;
                    }
                }
                sp++;
                ep++;
            }
        }
        // for(int i=0;i<str.length();i++){
        //     for(int j=0;j<str.length();j++){
        //         System.out.print(mpc[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(mpc[0][str.length()-1]);
    }
}