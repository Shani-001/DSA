
public class LinkedList {

    //Creating node
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Creating HEAD and TAIL
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step1=create New Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step2=newNode next=Head
        newNode.next = head;
        //step3=Head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public void print(){
     Node temp=head;
     while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
     }
     System.out.println("null");
    }

   public void addMiddle(int idx,int data){
    if(idx==0){
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
   }

    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev=head;
        for (int i = 0; i <size-2; i++) {
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        return val;
    }

    //search in a LinkedList
    public int search(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //recursive search in linked list
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
       int idx= helper(head.next,key);
       if(idx==-1){
        return -1;
       }
       return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    //reverse using iterative in linked list
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        // System.out.println("linkedlist size is:"+ll.size);
        // ll.removeFirst();
        // System.out.println(ll.removeLast());

        // System.out.println(ll.search(3));
        // System.out.println(ll.recSearch(2));
        ll.print();
        ll.reverse();
        ll.print();

    }
}
