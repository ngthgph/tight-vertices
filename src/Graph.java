import java.lang.reflect.Array;
import java.util.LinkedList;

public class Graph {
    LinkedList<Integer>[] adj;
    int n;

    Graph() {
        adj = null;
        n = 0;
    }

    void setData(LinkedList<Integer>[] a) {
        n = a.length;
        adj = a;

    }

    void visit(int a) {
        System.out.print(a + " ");
    }

    void dfs(int a, int b) {
        Stack s = new Stack();
        boolean[] isVisited = new boolean[n+1];
        int count = 0;
        int[] path = new int[n];


        if(adj[a].isEmpty())
            return;

        s.push(a);
        isVisited[a] = true;

        depth(s, isVisited, b, count, path);
    }

    void depth(Stack s, boolean[] isVisited, int b, int count, int[] path) {


        while(!s.isEmpty()){
            int current = s.pop();
            path[count] = current;
            if(current == b) {
                for (int i = 0; i <= count; i++)
                    visit(path[i]);
                System.out.println();
                return;
            }
            count++;

            for(int next : adj[current]) {
                if(!isVisited[next]) {
                    s.push(next);

                    isVisited[next] = true;
                    depth(s,isVisited, b, count, path);
                    isVisited[next] = false;
                }
            }
            count--;
        }
    }
}
