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

    //merge sort in ll
     public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //mid
    }

    public Node merge(Node head1,Node head2){
       Node mergeLL=new Node(-1);
    //    mergeLL.addFirst(-1);
       Node temp=mergeLL;
       while(head1!=null && head2!=null){
         if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
         }
         else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
         }
       }

       while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
       }
       while(head2!=null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
       }

       return mergeLL.next;
    }

    public Node mergeSort(Node head){
    if(head==null || head.next==null){
        return head;
    }

        //find mid
        Node midNode= getMid(head);
        //divide in 2 parts leftHalf and rightHalf
        Node rightHead=midNode.next;
        midNode.next=null;
        Node leftHead=head;
       Node newLeftHead= mergeSort(leftHead);
       Node newRightHead=  mergeSort(rightHead);
        //merge
        return merge(newLeftHead,newRightHead);
    }


    //ZIG ZAG FASHION IN LL

    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //alternate merging
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);  
        ll.addFirst(3);  
        ll.addFirst(2);  
        ll.addFirst(1);  
        ll.print();
        // head=ll;
    //    ll.head= ll.mergeSort(ll.head);
    //    System.out.print(ll);
    ll.zigzag();
    ll.print();

        
    }
}
