import java.util.*;
public class AdjacencyList{
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

    public static Boolean hasPath(ArrayList<Edge>graph[],int src,int des,Boolean Visited[]){
     if(src==des){
        return true;
     }
     Visited[src]=true;
     for(int i=0;i<graph[src].size();i++){
        Edge e=graph[src].get(i);
       if(!Visited[e.dest] && hasPath(graph, e.dest, des, Visited)){
        return true;
       }
     }
     return false;
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
    Boolean ans=hasPath(graph,0,2,Visited);
    System.out.println(ans+" ");
    }
}