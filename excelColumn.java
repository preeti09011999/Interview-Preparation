import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    StringBuilder ans = new StringBuilder();
    while(n>0){
        int rem = n % 26;
        if(rem == 0){
            ans.append("Z");
            n = n/26 -1;
        }
        else{
            char ch = (char)(rem - 1 + 'A');
            ans.append(ch);
            n = n / 26;
        }
    }
    
    System.out.println(ans.reverse());

 }
}
