public class DoublyLL{

    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
     
     public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
         head=tail=newNode;
         return;
        }
       newNode.next=head;
       head.prev=newNode;
       head=newNode;
     }

     public void removeFirst(){
        if(head==null){
            System.out.print("LL is empty");
        }
        if(head.next==null){
            head=tail=null;
            size--;
        }
        head.next.prev=null;
        head=head.next;
        size--;
     }

     public void reverse(){
        Node curr=head;
        Node prev1=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev1;
            curr.prev=next;
            prev1=curr;
            curr=next;
        }
        head=prev1;
     }
     
     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
     }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
    
       dll.addFirst(3);
       dll.addFirst(2);
       dll.addFirst(1);

       dll.print();
    //    dll.removeFirst();
       System.out.println("");
    //    dll.print();
    //    System.out.println(dll.size);
    dll.reverse();
    dll.print();
    }
}