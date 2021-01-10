import java.util.ArrayDeque;

public class rottenOranges {
    public static void main(String args[]){
        int grid[][] = {};
        rottingOranges(grid);
    }

    public static int rottingOranges(int grid[][]){
        int onecount = 0;
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1) onecount++;
                else if(grid[i][j] == 2) que.addLast(i*grid[0].length+j);
            }
        }
        int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
        int time = 0;
        if(onecount == 0) return 0;
        while(que.size()!=0){
            int size = que.size();
            while(size-->0){
                int pb = que.removeFirst();
                for(int d=0;d<4;d++){
                    int x = (pb/grid[0].length) + dir[d][0];
                    int y = (pb % grid[0].length) + dir[d][1];
                    if(x>=0 && y>=0 && x<grid.length && y<grid[0].length&&grid[x][y] == 1){
                        grid[x][y] = 2;
                        onecount--;
                        que.addLast((x*grid[0].length)+y);
                        if(onecount == 0) return time+1;
                    }
                }
            }
            time++;
        }
        return -1;
    }
}
