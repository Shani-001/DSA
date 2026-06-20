public class KthAncestor{
        static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static int kthAncestor(Node root,int node,int k){
        if(root==null){
            return -1;
        }
        if(root.data==node){
            return 0;
        }
        int leftNode=kthAncestor(root.left, node, k);
        int rightNode=kthAncestor(root.right, node, k);

        if(leftNode==-1 && rightNode==-1){
            return -1;
        }
        int max=Math.max(leftNode,rightNode);
        if(max+1==k){
           System.out.println(root.data);
        }
        return max+1;
    }
   
    
    public static void main(String[] args) {
        Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
      int node=5,k=3;
      kthAncestor(root,node,k);
    }
}