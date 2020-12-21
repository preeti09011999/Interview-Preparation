/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    String str = scn.next();
		    if(str.length() <= 3) System.out.println(-1);
		    else System.out.println(nextPalindrome(str));
		}
	}
	
	public static String nextPalindrome(String str){
	    char ch[] = str.toCharArray();
	    int n = str.length();
	    int mid = n/2 - 1;
	    int i = 0;
	    for(i=mid-1;i>=0;i--){
	        if(ch[i] < ch[i+1]) break;
	    }
	    if(i<0) return "-1";
	    int idx = i+1;
	    for(int j=i+2;j<=mid;j++){
	        if(ch[j]>ch[i] && ch[j] < ch[idx]) idx = j;
	    }
	    swap(ch,i,idx);
	    swap(ch,n-i-1,n-idx-1);
	    reverse(ch,i+1,mid);
	    if(n % 2 == 0){
	        reverse(ch,mid+1,n-i-2);
	    }else reverse(ch,mid+2,n-i-2);
	    String ans = String.valueOf(ch);
	    return ans;
	}
	
	public static void reverse(char ch[], int i, int j){
	    while(i<j){
	        char temp = ch[i];
	        ch[i] = ch[j];
	        ch[j] = temp;
	        i++;
	        j--;
	        
	    }
	}
	
	public static void swap(char ch[], int i, int j){
	    char temp = ch[i];
	    ch[i] = ch[j];
	    ch[j] = temp;
	}
}
