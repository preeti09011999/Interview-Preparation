import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = scn.nextInt();
        solve(n,s);
    }
    
    private static final int MOD = 1000000007;
    
    public static int solve(int n, int s) {
        Integer[][] dp = new Integer[n+1][s+1];
        int sol = solve(n, s, dp);
        // System.out.println(Arrays.deepToString(dp));
        for(int i=0;i<=n;i++){
            for(int j=0;j<=s;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        } 
        System.out.println(sol);
        return sol;
    }
    
    private static int solve(int n, int s, Integer[][] dp) {
        if (n == 0 && s == 0) {
            return 1;
        } else if (s == 0 && n != 0) {
            return 0;
        } else if (n == 0 && s != 0) {
            return 0;
        } else {
            if (dp[n][s] == null) {
                int sum = 0;
                for (int i = 0; i <= 9 && i <= s; i++) {
                    sum = sum + solve(n-1, s - i, dp) ;
                }
                dp[n][s] = sum;
            }
            return dp[n][s];
        }
    }
}
// sum = ((sum % MOD) + (solve(n-1, s - i, dp) % MOD)) % MOD;
