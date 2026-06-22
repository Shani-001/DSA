

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

    public static Node create(int arr[],int start,int end){
        if(start>end){
            return null;
        }
      int mid=start+(end-start)/2;
      Node root=new Node(arr[mid]);
      root.left=create(arr,start,mid-1);
      root.right=create(arr, mid+1, end);
      return root;
    }

    public static void preorder(Node root){
        if(root==null){
            // System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    
     
    public static void main(String[] args) {
        int val[]={3,4,5,6,7,8,9,11,14,15};
        Node root;
       
        // inOrder(root);
    //    System.out.println("");
       root=create(val, 0, val.length-1);
        // inOrder(root);
        preorder(root);
    }
}