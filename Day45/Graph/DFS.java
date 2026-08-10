import java.util.*;
public class DFS{
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

      
    public static void dfs(ArrayList<Edge>graph[],int curr,Boolean Visited[]){
    System.out.print(curr+" ");
    Visited[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
         Edge e=graph[curr].get(i);
       if(!Visited[e.dest]){
         dfs(graph,e.dest,Visited);
       }
    }
    }
    public static void main(String args[]){
   int V=5;
     
     ArrayList<Edge> graph[]=new ArrayList[V];
     for(int i=0;i<V;i++){
        graph[i]=new ArrayList<>();
     }
     graph[0].add(new Edge(0,1,5));
     graph[1].add(new Edge(1,0,5));
     graph[1].add(new Edge(1,2,1));
     graph[1].add(new Edge(1,3,3));
     graph[2].add(new Edge(2,1,1));
     graph[2].add(new Edge(2,3,1));
     graph[2].add(new Edge(2,4,2));
     graph[3].add(new Edge(3,1,3));
     graph[3].add(new Edge(3,2,1));
     graph[4].add(new Edge(4,2,2));
    
    Boolean Visited[]=new Boolean[5];
      for(int i=0;i<5;i++){
        Visited[i]=false;
    }
    dfs(graph,0,Visited);
    }
}