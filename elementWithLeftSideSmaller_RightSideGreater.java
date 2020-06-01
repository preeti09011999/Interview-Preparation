// --------------------------- with O(n^2) complexity-----------------------------------------
// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Main{
// 	public static void main (String[] args) {
// 	   Scanner scn = new Scanner(System.in);
// 	   int t = scn.nextInt();
// 	   while(t-- > 0){
// 	       int n = scn.nextInt();
// 	       int arr[] = new int[n];
// 	       for(int i=0;i<n;i++){
// 	           arr[i] = scn.nextInt();
// 	       }
// 	       int count = 0;
// 	       for(int i=1;i<n-1;i++){
// 	           boolean resl = left(arr,i);
// 	           boolean resr = right(arr,i);
// 	           if(resl&&resr){
// 	               System.out.println(arr[i]);
// 	               count++;
// 	               break;
// 	           }
// 	       }
// 	       if(count==0){
// 	           System.out.println("-1");
// 	       }
// 	   }
// 	}
	
// 	public static boolean left(int arr[], int idx){
// 	    boolean flag = false;
// 	    int count = 0;
// 	    for(int i=0;i<idx;i++){
// 	        if(arr[i]<arr[idx]){
// 	            count++;
// 	        }
// 	    }
// 	    if(count == idx){
// 	        flag = true;
// 	    }
// 	    return flag;
// 	}
// 	public static boolean right(int arr[], int idx){
// 	    boolean flag = false;
// 	    int count = 0;
// 	    for(int i=idx+1;i<arr.length;i++){
// 	        if(arr[i]>arr[idx]){
// 	            count++;
// 	        }
// 	    }
// 	    if(count == (arr.length - idx-1)){
// 	        flag = true;
// 	    }
// 	    return flag;
// 	}
// }