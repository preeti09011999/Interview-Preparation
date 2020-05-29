
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i=0;i<t;i++){
		    int n = scn.nextInt();
		    int arr[] = new int[n];
		    for(int l=0;l<n;l++){
		        arr[l] = scn.nextInt();
		    }
		    System.out.println(trapp(arr,n));
		}
	}
	
	public static int trapp(int arr[],int n){
	    int sum = 0;
	    for(int i=1;i<n-1;i++){
	        int left = arr[i];
	        // largest left boundary
	        for(int j=0;j<i;j++){
	            left = Math.max(left,arr[j]);
	        }
	        int right = arr[i];
	        // largest right boundary
	        for(int k=i+1;k<n;k++){
	            right = Math.max(right,arr[k]);
	        }
	        
	        sum = sum + (Math.min(left,right) - arr[i]);
	    }
	    return sum;
	}
}