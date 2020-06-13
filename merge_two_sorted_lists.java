import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]){
        // Scanner scn = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>(); 
        a.add(-4);
        a.add(3);
        // a.add(8);
        b.add(-2);
        b.add(-2);
        // System.out.println(a);
        // System.out.println(b);
        merge(a,b);
    }
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int i = 0;
	    int j = 0;
	    while(i<a.size()&&j<b.size()){
	        if(a.get(i)<b.get(j)){
	            i++;
	        }else{
	            a.add(i,b.get(j));
	            b.remove(j);
	        }
	    }
	    
	    while(b.size()>0){
	        a.add(b.get(j));
	        b.remove(j);
	    }
	    System.out.println(a);
	    System.out.println(b);
	}
}
