

class BST{
    static class Node{
        int data;
        Node right,left;
        Node(int data){
          this.data=data;
        }
    }
     
     public static void inOrder(Node root){
       if(root==null){
        return;
       }
       inOrder(root.left);
       System.out.print(root.data+" ");
       inOrder(root.right);
     }

    public static Node insert(Node root,int val){
      if(root==null){
        return new Node(val);
      }
      if(root.data>val){
       root.left= insert(root.left,val);
      }
      else{
       root.right= insert(root.right,val);
      }
      return root;
    }
    
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
       Node leftSubtree=mirrorBST(root.left);
        Node rightSubtree=mirrorBST(root.right);
        root.left=rightSubtree;
        root.right=leftSubtree;
        return root;
    }
    public static void main(String[] args) {
        int val[]={8,5,3,6,10,11,14};
        Node root=null;
        for (int i = 0; i < val.length; i++) {
           root= insert(root, val[i]);
        }
        inOrder(root);
       root= mirrorBST(root);
       System.out.println("");
        inOrder(root);
    }
}