import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    ArrayList<Integer>[] graph;
    int[] visitedTime;
    int[] lowTime;
    int time;
    List<List<Integer>> result;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        for(List<Integer> list : connections){
                list.set(0,list.get(0)-1);
                list.set(1,list.get(1)-1);
        }
        result = new ArrayList<>();
        graph = new ArrayList[n];
        visitedTime = new int[n];
        lowTime = new int[n];
        time = 0;
        generateGraph(connections);
        boolean[] visited = new boolean[n];
        dfs(0, -1, visited);
        for(List<Integer> list : result){
                list.set(0,list.get(0)+1);
                list.set(1,list.get(1)+1);
        }
        return result;
    }
    public void dfs(int current, int parent, boolean[] visited){
        visited[current] = true;
        visitedTime[current] = lowTime[current] = time++;
        for(int neighbor: graph[current]){
            if(neighbor == parent) continue;
            if(!visited[neighbor]){
                dfs(neighbor, current, visited);
                lowTime[current] = Math.min(lowTime[current], lowTime[neighbor]);
                if(lowTime[neighbor] > visitedTime[current]){
                    result.add(Arrays.asList(current, neighbor));
                }
            }
            else{
                lowTime[current] = Math.min(lowTime[current], visitedTime[neighbor]);
            }
        }
    }
    
    public void generateGraph(List<List<Integer>> connections){
        for(int i = 0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(List<Integer> list: connections){
            graph[list.get(0)].add(list.get(1));
            graph[list.get(1)].add(list.get(0));
        }
    }
   
}
