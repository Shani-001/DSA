public class StackLinkedList{
    static class Node{
        int data;
        Node next;

        public Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public static class Stack{
       public static Node head;

       //isEmpty
       public static boolean isEmpty(){
        return head==null;
       }

       //push
       public static void push(int n){
        Node newNode=new Node(n);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
       }

       //pop
       public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
       }

       //peek
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
       }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
        }
    }
}