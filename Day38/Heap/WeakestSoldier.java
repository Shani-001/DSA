
import java.util.PriorityQueue;

public class WeakestSoldier{
    static class Info implements Comparable<Info>{
        int Soldiers;
        int idx;
      Info(int Soldiers,int idx){
        this.Soldiers=Soldiers;
        this.idx=idx;
       }
       @Override
       public int compareTo(Info r2){
        if(this.Soldiers==r2.Soldiers){
            return this.idx-r2.idx;
        }
       return this.Soldiers-r2.Soldiers;
       }

    }
    public static void main(String[] args) {
        int arr[][]={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0},
        };
        PriorityQueue<Info> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int Soldiers=0;
            for (int j = 0; j < arr[0].length; j++) {
                Soldiers+=arr[i][j]==1?1:0;
            }
          pq.add(new Info(Soldiers,i));
        }
        System.out.println("ans is row:-"+ pq.remove().idx+" & "+pq.remove().idx);
        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek().Soldiers+" "+pq.peek().idx);
        //     pq.remove();
        // }

    }
}