
import java.util.Deque;
import java.util.LinkedList;

public class StackDeque{
    public static class Stack{
       static Deque<Integer>s=new LinkedList<>();

       //isEmpty
       public static boolean isEmpty(){
        return s.isEmpty();
       }
        //push
        public static void push(int data){
          s.addLast(data);
        }
        //pop
        public static int pop(){
            if(s.isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
           return s.removeLast();
        }

        public static int peek(){
            if(s.isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
           return s.getLast();
        }
    }
    public static void main(String[] args) {
         Stack s=new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);

         while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
         }
    }
}