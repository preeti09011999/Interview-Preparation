class Solution {
    public int getMaximumGold(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0; 
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}}; 
        int gold = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] != 0) 
                max = Math.max(max,goldmine(grid,i,j,dir));
            }
        }
        return max;
    }
    
    public static int goldmine(int[][] grid, int sr, int sc, int dir[][]){
        grid[sr][sc] = -grid[sr][sc];
        int maxgold = 0;
        for(int d=0;d<4;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]>0){
                maxgold = Math.max(maxgold,goldmine(grid,r,c,dir));
            }
        }
        grid[sr][sc] = -grid[sr][sc];
        return maxgold + grid[sr][sc];
    }
}
