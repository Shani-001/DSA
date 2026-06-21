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

    public static void printRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
        printRange(root.left, k1, k2);
        System.out.print(root.data+" ");
        printRange(root.right,k1,k2);
        }
        else if(root.data<k2){
            printRange(root.right, k1, k2);
        }else{
            printRange(root.left,k1,k2);
        }
    }

    public static void main(String[] args) {
        int val[]={5,4,3,2,1,6,7,8,9,10};
        Node root=null;
        for (int i = 0; i < val.length; i++) {
            root=insert(root,val[i]);
        }
        printRange(root,5,8);
    }
}
