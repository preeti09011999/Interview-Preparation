import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    solve(n);
 }
 
 public static void solve(int n){
     int count = 0;
     for(int y=n+1;y<=n*n + n;y++){
         if((n*n) % (y-n) == 0){
             int x = (n*y)/(y-n);
             System.out.println(x+" "+y);
             count++;
         }
     }
     System.out.println(count);
 }
}
