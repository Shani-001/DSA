
import java.util.PriorityQueue;

public class SlidingWindow{
    static class Info implements Comparable<Info>{
        int idx;
        int val;
        public Info(int idx,int val){
         this.idx=idx;
         this.val=val;
        }
        @Override
        public int compareTo(Info s1){
          return s1.val-this.val;
        }

    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;

        PriorityQueue<Info>pq=new PriorityQueue<>();
       int ans[]=new int[arr.length-k+1];
       pq.add(new Info(0,arr[0]));
       pq.add(new Info(1,arr[1]));
       pq.add(new Info(2,arr[2]));
       ans[0]=pq.peek().val;

        // for (int i = 0; i < arr.length-2; i++) {
        //     pq.add(arr[i]);
        //     pq.add(arr[i+1]);
        //     pq.add(arr[i+2]);
        //     System.out.print(pq.remove()+" ");
        //     pq.remove();
        //     pq.remove();
        // }
        for (int i = 3; i <arr.length; i++) {
            while(pq.peek().idx<=i-k){
                pq.remove();
            }
            pq.add(new Info(i,arr[i]));
            ans[i-k+1]=pq.peek().val;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}