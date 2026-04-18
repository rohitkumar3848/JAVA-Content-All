import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class graph{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            //create graph as empty instaed of null
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1,5));
        
        graph[1].add(new Edge(0, 2,10));
        graph[1].add(new Edge(1, 3,15));

        graph[2].add(new Edge(1, 0,20));
        graph[2].add(new Edge(2, 0,25));
        graph[2].add(new Edge(2, 4,30));
        
        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 4,35));
        graph[3].add(new Edge(3, 5,35));
        graph[3].add(new Edge(4, 2,35));
        graph[3].add(new Edge(4, 3,35));
        graph[3].add(new Edge(4, 5,35));
        graph[3].add(new Edge(5, 3,35));
        graph[3].add(new Edge(5, 4,35));
        graph[3].add(new Edge(5, 6,35));
        graph[3].add(new Edge(6, 5,35));
    }
    public static void bfs(ArrayList<Edge> graph[],int v,boolean[] visited,int start){
        Queue<Integer> q1=new LinkedList<>();
        q1.add(start);
        while(!q1.isEmpty()){
            int cur=q1.remove();
            if(visited[cur]==false){
                System.out.print(cur+" ");
                visited[cur]=true;
                for(int i=0;i<graph[cur].size();i++){
                    Edge e=graph[cur].get(i);
                    q1.add(e.dest);
                }
            }
            
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int start,boolean[] visited){
        System.out.print(start+" ");
        visited[start]=true;
        for(int i=0;i<graph[start].size();i++){
            Edge e=graph[start].get(i);
            if(visited[e.dest]==false){
                dfs(graph,e.dest,visited);
            }
        }
    }
    public static void printAllPath(ArrayList<Edge> graph[],boolean visited[],int cur,String path,int tar){
        if(cur==tar){
            System.out.println(path);
            return ;
        }
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            if(!visited[e.dest]){
                visited[e.dest]=true;
                printAllPath(graph, visited, e.dest, path+"->"+e.dest, tar);
                visited[e.dest]=false;
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        //Print Neighbours of 2-->
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e=graph[2].get(i);
        //     System.out.println(e.dest+" "+e.wt+" ");
        // }
        // System.out.println("");
        // boolean vis[]=new boolean[v];
        // for(int i=0;i<v;i++){
        //     if(vis[i]==false){
        //         bfs(graph, v,vis,i);
        //     }
        // }
        // System.out.println(" ");
        //dfs(graph, 0, vis);
        //bfs(graph, v);
        int src=0;
        int tar=5;
        printAllPath(graph,new boolean[v],src,"0",tar);
    }
    
}