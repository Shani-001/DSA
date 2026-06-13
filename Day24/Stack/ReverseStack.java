import java.util.*;
public class ReverseStack{

    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int curr=s.pop();
        pushAtBottom(s, data);
        s.push(curr);

    }
   
   public static void ReverseStack(Stack<Integer>s){
      
      if(s.isEmpty()){
        return;
      }

     //pop
     int curr=s.pop();
     ReverseStack(s);
     pushAtBottom(s,curr);
   }

   public static void printStack(Stack<Integer>s) {
        System.out.println("-----------ans-----------");
       while(!s.isEmpty()){
        System.out.println(s.pop());
       }
       s.push(1);
       s.push(2);
       s.push(3);
   }
    public static void main(String[] args) {
       Stack<Integer>s=new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       printStack(s);
       ReverseStack(s);
       printStack(s);
    }
}