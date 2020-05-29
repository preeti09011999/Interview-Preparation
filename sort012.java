import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		// coode here 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = scn.nextInt();
		}

    public static void sort012(int a[], int n){
        // code here 
        int lo = 0;
        int hi = n-1;
        int mid = 0;
        
        while(mid<=hi){
            switch(a[mid]){
            
            case 0:{
                int temp = 0;
                temp = a[mid];
                a[mid] = a[lo];
                a[lo] = temp;
                mid++;
                lo++;
                break;
            }case 1:{
                mid++;
                break;
            }case 2:{
                int temp = 0;
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
