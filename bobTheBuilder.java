import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] triplet = new int[n][3];
        for(int i=0;i<n;i++){
            triplet[i][0] = scn.nextInt();
            triplet[i][1] = scn.nextInt();
            triplet[i][2] = scn.nextInt();
        }
        List<List<Integer>> ans = getSkyline(triplet);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i).get(0)+" "+ans.get(i).get(1));
            System.out.println();
        }
    }
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((b1, b2) -> (b2[2] - b1[2]));
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int currHeight = 0;
        for(int i = 0; i < buildings.length + 1; i++) {
            int[] building = i != buildings.length ? buildings[i] : null;
            while (!queue.isEmpty() && (building == null || queue.peek()[1] < building[0])) {
                int[] buildingToRemove = queue.remove();
                while (!queue.isEmpty() && queue.peek()[1] <= buildingToRemove[1]) {
                    queue.remove();
                }
                currHeight = queue.isEmpty() ? 0 : queue.peek()[2];
                addToRes(buildingToRemove[1], currHeight, res);
            }
            
            if (building == null) {
                return res;
            }
            
            if (building[2] > currHeight) {
                currHeight = building[2];
                addToRes(building[0], currHeight, res);
            }
            
            queue.add(building);
        }
        
        return res;
    }
    
    private static void addToRes(int x, int currHeight, List<List<Integer>> res) {
        List<Integer> last = res.size()!= 0 ? res.get(res.size() - 1) : null;
        if (last != null && last.get(0) == x) {
            last.set(1, Math.max(last.get(1), currHeight));
        } else if (last != null && last.get(1) == currHeight) {
            return;
        } else {
            List<Integer> subRes = new ArrayList<Integer>();
            subRes.add(x);
            subRes.add(currHeight);
            res.add(subRes);
        }
    }
}
