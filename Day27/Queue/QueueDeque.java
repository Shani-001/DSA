
import java.util.Deque;
import java.util.LinkedList;

public class QueueDeque{
    public static class Queue{
       static Deque<Integer>q=new LinkedList<>();

       //isEmpty
       public static boolean isEmpty(){
        return q.isEmpty();
       }
        //push
        public static void add(int data){
          q.addLast(data);
        }
        //pop
        public static int remove(){
            if(q.isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
           return q.removeFirst();
        }

        public static int peek(){
            if(q.isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
           return q.getFirst();
        }
    }
    public static void main(String[] args) {
         Queue q=new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);

         while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
         }
    }
}