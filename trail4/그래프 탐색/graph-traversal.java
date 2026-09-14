import java.util.*;

public class Main {

    public static class DFS{
        int N;
        boolean [] visited;
        List<Integer> [] graph;
        int count;

        public DFS(List<Integer> [] list){
            N = list.length;
            visited = new boolean [N];
            graph = list;
            count = 0;

            for(int i = 0; i < N; i++){
                visited[i] = false;
            }
            dfs(1);
        }

        private void dfs(int i){
            visited[i] = true;
            for(Integer I : graph[i]){
                if(!visited[I]){
                    count++;
                    dfs(I);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> [] list = new List[n + 1];
        
        for(int i = 0; i < n + 1; i++){
            list[i] = new LinkedList<Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[x].add(y);
            list[y].add(x);
        }
        DFS d = new DFS(list);
        System.out.print(d.count);        
    }

    
}
