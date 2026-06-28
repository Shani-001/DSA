
import java.util.PriorityQueue;

public class NearestCars{
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int idx;
        int disSq;
        public Point(int x,int y,int idx,int disSq){
            this.x=x;
            this.y=y;
            this.idx=idx;
            this.disSq=disSq;
        }
        @Override
        public int compareTo(Point s2){
          return this.disSq-s2.disSq;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{3,3},{5,-1},{-2,4},{1,2}};
        int k=2;

        PriorityQueue<Point>pq=new PriorityQueue<>();
         
         for (int i = 0; i <arr.length; i++) {
             int disSq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
             pq.add(new Point(arr[i][0],arr[i][1],i,disSq));
         }
         for (int i = 0; i < k; i++) {
             System.out.println("C"+pq.remove().idx);
         }
    }
}