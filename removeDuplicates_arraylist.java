import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]){
        // Scanner scn = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        // ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        
        // a.add(8);
        // b.add(-2);
        // b.add(-2);
        System.out.println(a);
        System.out.println(removeDuplicates(a));
    }

    public static int removeDuplicates(ArrayList<Integer> a) {
        if(a.size() == 0||a.size()==1){
            return 1;
        }else{
            int i = 0;
            for(int j=1;j<a.size();j++){
                if(!a.get(j).equals(a.get(i))){
                    a.set(++i,a.get(j));
                }
            }
            
            while(a.size()>i+1){
                a.remove(a.size()-1);
            }
            // System.out.println(a);
            return a.size();
        }
    }


} 
