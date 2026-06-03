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
    
    //find element from last and then remove
    public void FindAndRemoveFromEnd(int idx){
        int siz=0;
        Node temp=head;
        while(temp!=null){
            siz++;
            temp=temp.next;
        }
        // System.out.print(size);
        Node prev=head;
        int i=1;
        while(i<(siz-idx)){
            prev=prev.next;
           i++; 
        }
        prev.next=prev.next.next;
    }


    //Check if LL is Palindrome
    //function to find mid
    public Node slowFast(){
        Node slow=head;
        Node Fast=head;

        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
        }
        return slow;
    }

    //palindrome Function
    public boolean palindrome(){
        //step1 Find the mid Node
        Node midNode=slowFast();
        //step2 Reverse the ll from mid to end
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //step3 check if 1st half==2nd half
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
              return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    //detect cycle
    public static boolean DetectCycle(){
        Node Slow=head;
        Node Fast=head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
            if(Slow==Fast){
                return true; //cycle exists
            }
        }
        return false; //cycle doesnt exist
    }

    //remove Cycle
    public static void removeCycle(){
    //1.detect cycle 
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
        cycle =true;
        break;
        }
    }
    if(cycle==false){
        return;
    }   
    //2.make slow=head=1 and fast =>1
    Node prev=null;
    slow=head;
    while(slow!=fast){
      prev=fast;
      slow=slow.next;
      fast=fast.next;
    }
    //3.prev.next=null
    prev.next=null;
    }

    public static void main(String args[]) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(1);
        // ll.addLast(1);
        // ll.addLast(1);   
        // // ll.addMiddle(2, 9);
        // // ll.print();
        // // ll.FindAndRemoveFromEnd(3);
        // ll.print();
        // // System.out.print(ll.palindrome());

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next=head.next.next;
        
        System.out.println(DetectCycle());
        removeCycle();
        System.out.println(DetectCycle());

    }
}
