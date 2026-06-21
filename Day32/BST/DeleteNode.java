class BST{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
         this.data=data;
        }
    }
    
    public static Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static Node deleteNode(Node root,int val){
     if(root.data>val){
       root.left= deleteNode(root.left,val);
     }
     else if(root.data<val){
       root.right= deleteNode(root.right,val);
     }
     else{
        //case1:leaf node delete
        if(root.left==null&&root.right==null){
            return null;
        }
        // case2:single child
        if(root.left==null){
            return root.right;
        }
       else if(root.right==null){
            return root.left;
        }
        //case3:2 children
        Node IS=findInorederSuccesor(root.right);
        root.data=IS.data;
       root.right= deleteNode(root.right,IS.data);
     }
     return root;
    }

    public static Node findInorederSuccesor(Node root){
       while(root.left!=null){
        root=root.left;
       }
       return root;
    }

    public static void main(String[] args) {
        int val[]={5,4,3,2,1,6,7,8,9,10};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
            root=insert(root,val[i]);
        }

        inorder(root);
       root= deleteNode(root, 5);
        System.out.println("");
        inorder(root);
    //    System.out.println(searchBST(root, 5));

    }
}