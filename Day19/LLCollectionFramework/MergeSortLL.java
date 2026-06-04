import java.util.LinkedList;
public class MergeSortLL{
   class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
   }

   public static Node head;
     
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
       while(head1!=null || head2!=null){
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
        mergeSort(leftHead);
        mergeSort(rightHead);
        //merge
        return merge(leftHead,rightHead);
    }

    public static void main(String args []){
     LinkedList<Integer> ll=new LinkedList<>();
     ll.addFirst(2);
    Node head=ll.add(1);
     ll.addLast(3);
     ll.addLast(1);
     ll.addFirst(4);
     ll.head=ll.mergeSort(ll.head);
     System.out.println(ll.ans);
    }
}