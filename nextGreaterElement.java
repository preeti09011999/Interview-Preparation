/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    long arr[] = new long[n];
		    for(int i=0;i<n;i++){
		        arr[i] = Long.parseLong(br.readLine());
		    }
		    long narr[] = nle(arr);
		    display(narr);
		}
	}
	
	public static void display(long[] a){
        StringBuilder sb = new StringBuilder();
    
        for(long val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
	public static long[] nle(long arr[]){
	    Stack<Long> st = new Stack<>();
	    long rarr[] = new long[arr.length];
	    for(int i=arr.length-1;i>=0;i--){
	        //pop
	        while(st.size()>0&&st.peek()<arr[i]){
	            st.pop();
	        }
	        //print
	        if(st.size()==0){
	            rarr[i] = -1;
	        }else{
	            rarr[i] = st.peek();
	        }
	        //push
	        st.push(arr[i]);
	    }
	    return rarr;
	}

}