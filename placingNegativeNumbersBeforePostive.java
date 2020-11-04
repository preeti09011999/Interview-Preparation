import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int a[] = {0,1,9,2,4,0,3,-5};
        convert(a);
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
    }
    
    public static void convert(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int j = i-1;
                int temp = i;
                    while(j>=0 && a[j] >= 0) {
                        swap(a,temp,j);
                        temp = j;
                        j--;
                    }
                }
            }
        
    }
    
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
