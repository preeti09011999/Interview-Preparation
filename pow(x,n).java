import java.util.*;

public class Main{

public static void main(String[] args) { 

// write your code here.\
// System.out.println((double)1/(2*2));
System.out.println(myPow(2.00000,-2));
}
    public static double myPow(double x, int n) {
     if(n==0){
         return 1;
     }   
        
        if(n>0){
            double p1 = myPow(x,n/2);
            double p = p1 * p1;
            if(n%2 == 1){
                return p*x;
            }
            else 
                return p;
        }else{
            double p1 = myPow(x,n/2);
            double p = (p1*p1);
            if(n%2 == -1){
                return p * (1/x);
            }else
                return p;
        }
    }

 }
