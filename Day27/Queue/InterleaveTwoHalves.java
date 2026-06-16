
import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoHalves{

    public static void InterLeave2Halve(Queue<Integer>q){
        Queue<Integer>first=new LinkedList<>();
        int size=q.size();
        for (int i =0; i < size/2; i++) {   //dont write q.size()/2 because it will change so it will give wrong ans
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        InterLeave2Halve(q);
    }
}