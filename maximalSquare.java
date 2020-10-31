class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int dp[][] = new int[matrix.length+1][matrix[0].length+1];
        int maxsq = 0;
        for(int i=1;i<=matrix.length;i++){
            for(int j=1;j<=matrix[0].length;j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
                    maxsq = Math.max(maxsq, dp[i][j]);
                }
            }
        }
        return maxsq*maxsq;
    }
}
// efficient approach
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int maxsq = 0, prev = 0;
        int dp[] = new int[matrix[0].length + 1];
        for(int i=1;i<=matrix.length;i++){
            for(int j=1;j<=matrix[0].length;j++){
                int temp = dp[j];
                if(matrix[i-1][j-1] == '1'){
                    dp[j] = Math.min(dp[j], Math.min(dp[j-1], prev)) + 1;
                    maxsq = Math.max(dp[j], maxsq);
                } else{
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsq*maxsq;
    }
}
