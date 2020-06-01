import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    String str = scn.next();
		    int num;
            int len = str.length();
            if(len>3){
                String sb = str.substring(len-3,len);
                num = Integer.parseInt(sb);
            }else{
                num = Integer.parseInt(str);
            }
            if(num%8 == 0){
                System.out.println("1");
            }else{
                System.out.println("-1");
            }
		}
	}
}