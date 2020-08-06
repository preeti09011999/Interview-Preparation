class GfG {
    public static ArrayList<String> printPath(int[][] m, int n) {
        if(n==0 || m[0][0] == 0||m[n-1][n-1]==0){
            return new ArrayList<>();
        }
        int dir[][] = {{1,0},{0,-1},{0,1},{-1,0}};
        String[] dirF = {"D","L","R","U"};
        ArrayList<String> ress = new ArrayList<String>();
        rat_Maze(0,0,n-1,n-1,dir,dirF,m,"",ress);
        return ress;
    }
    
    public static void rat_Maze(int sr,int sc,int dr, int dc, int dir[][],String dirF[],int[][] m,String psf,ArrayList<String> res){
        if(sr == dr && sc == dc){
            res.add(psf);
        }

        m[sr][sc] = 0;
        for(int d=0;d<4;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r>=0 && c >= 0 && r<=dr && c<=dc && m[r][c] == 1){
                rat_Maze(r,c,dr,dc,dir,dirF,m,psf+dirF[d],res);
            }
        }
        m[sr][sc] = 1;

    }
}
