import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(tss(arr,n));
    }
    
    public static boolean tss(int arr[],int n){
        Arrays.sort(arr);
        
        int si = 0;
        
        boolean flag = false;
        while(si<n-2){
            int l = si+1;
            int r = n-1;
         
            while(l!=r){
                
                if(arr[l]+arr[r] == arr[si]*(-1)){
                  
                    flag = true;
                    break;
                }
                else if(arr[l]+arr[r] < (arr[si]*(-1)))
                    l++;
                else
                    r--;  
            }
            si++;
        }
        return flag;
    }
}

// -------------------------------------using hash map--------------------------------------
// class Triplet
// {
//     // Function to check if triplet is present 
//     // arr[]: input array
//     // n: size of the array
// 	public boolean findTriplets(int arr[] , int n)
//     {
//         //add code here.
//         boolean found = false; 
  
//         for (int i = 0; i < n - 1; i++)  
//         { 
//             // Find all pairs with sum equals to 
//             // "-arr[i]" 
//             HashSet<Integer> s = new HashSet<Integer>(); 
//             for (int j = i + 1; j < n; j++)  
//             { 
//                 int x = -(arr[i] + arr[j]); 
//                 if (s.contains(x))  
//                 { 
                    
//                     found = true; 
//                 }  
//                 else 
//                 { 
//                     s.add(arr[j]); 
//                 } 
//             } 
//         }
//         return found;
//     }
// }