import java.util.*;

public class Main{

public static void main(String[] args) {

// write your code here.
System.out.println(coprime(16));
 }
 
 public static int coprime(int n){
     int count = 1;
     for(int i=2;i<n;i++){
         
         if(gcd(n,i) == 1){
             System.out.println(i);
             count++;
         } 
    }
    return count;
 }
 
 public static int gcd(int n1,int n2){
     if(n2==0) return n1;
     return gcd(n2,n1%n2);
 }
}
