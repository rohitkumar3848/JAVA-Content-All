
import java.util.*;

public class cycledDetection {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean vis[], int cur, boolean rec[]) {
        vis[cur]=true;
        rec[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!rec[e.dest]){
                if(isCyclic(graph,vis,e.dest,rec)){
                    return true;
                }
            }
        }
        rec[cur]=false;
        return false;
    }


    public static void main(String args[]) {
        /*
         * 0 ------- 3
         * /| |
         * / | |
         * 1 | 4
         * \ |
         * \ |
         * 2
         */
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        //System.out.println(isCyclic(graph, new boolean[V],0,new boolean[V]));
        boolean rec[]=new boolean[V];
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                boolean iscycle=isCyclic(graph, vis,i,rec);
                if(iscycle){
                    System.out.println(iscycle);
                    break;
                }
            }
        }
    }
}
