import java.io.*;
import java.util.*;

class Solution 
{ 
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
            
        }
    }
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int li = 0;
	    int mid = 0;
	    while(mid<=n-1){
	        if(arr[mid]==0){
	            int temp = arr[li];
	            arr[li] = arr[mid];
	            arr[mid] = temp;
	            li ++;
	            mid++;
	        }
	        else{
	            mid ++;
	        }
	    }
	    return arr;
	} 
} 
