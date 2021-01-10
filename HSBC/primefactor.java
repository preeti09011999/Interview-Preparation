import java.util.*;

public class primefactor {
    public static void main(String[] args) {

        // write your code here.
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int a[] = {1,2,3,2,5,6};
            int temp = n;
            int ans = 0;
            for(int i=2;i*i<=n;i++){
                int count = 0;
                while(temp % i == 0){
                    count++;
                    temp /= i;
                }
                ans += (count * a[i]);
            }
            System.out.println(ans);
    }
}
