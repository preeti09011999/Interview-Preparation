public class stringEval{

    public static int stringEva(String str){
        int ans = 0;
        for(int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            int val = (int)Math.pow(10,ch-'A');
            // System.out.println(val);
            ans += val;
        }
        return ans;
    }
}
