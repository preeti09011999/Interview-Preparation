/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scn.nextInt();
            }
            int i = 0,j=0;
            while(j<n){
                if(a[j] == 1){
                    j++;
                } 
                else{
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j++;
                }
            }
            for(i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
	}
}
