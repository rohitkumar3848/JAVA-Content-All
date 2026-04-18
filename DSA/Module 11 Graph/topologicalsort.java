
import java.util.*;
import java.util.Stack;

public class topologicalsort {
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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topoUtilSort(ArrayList<Edge> graph[], boolean[] vis, int cur, Stack<Integer> s1) {
        vis[cur] = true;
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!vis[e.dest]) {
                topoUtilSort(graph, vis, e.dest, s1);
            }
        }
        s1.push(cur);
    }

    public static void topoSort(ArrayList<Edge> graph[], int v) {
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topoUtilSort(graph, vis, i, stack);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topoSort(graph,V);
    }
}
