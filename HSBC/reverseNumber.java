public class reverseNumber {
    public static int reverse(int x) {
        int n = 0;
        while(x != 0){
            int n1 = x%10;
            x /= 10;
            if(n > Integer.MAX_VALUE/10 || (n == Integer.MAX_VALUE/10 && n1 > 7)){
                return 0;
            }    
            if(n < Integer.MIN_VALUE/10 || (n == Integer.MIN_VALUE/10 && n1 < -8)){
                return 0;
            }
            n = n*10 + n1;
        }
        return n;
    }

    public static void main(String args[]){
        reverse(12345677);
    }
}
