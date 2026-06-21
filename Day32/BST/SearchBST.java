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

    // public static void inorder(Node root){
    //     if(root==null){
    //         return;
    //     }
    //     inorder(root.left);
    //     System.out.print(root.data+" ");
    //     inorder(root.right);
    // }

    public static boolean searchBST(Node root,int key){
        if(root==null){
            return false;
        }
        
        if(root.data==key){
            return true;
        }

        if(root.data>key){
            return searchBST(root.left, key);
        }else{
            return searchBST(root.right,key);
        }

    }


    public static void main(String[] args) {
        int val[]={5,4,3,2,1,6,7,8,9,10};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
            root=insert(root,val[i]);
        }

        // inorder(root);
       System.out.println(searchBST(root, 5));

    }
}