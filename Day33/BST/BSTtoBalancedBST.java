
import java.util.ArrayList;



class BST{
    static class Node{
        int data;
        Node right,left;
        Node(int data){
          this.data=data;
        }
    }
     
     public static void inOrder(Node root,ArrayList<Integer>sortedArr){
       if(root==null){
        return;
       }
       inOrder(root.left,sortedArr);
    //    System.out.print(root.data+" ");
       sortedArr.add(root.data);
       inOrder(root.right,sortedArr);
     }

    public static Node create(ArrayList<Integer>arr,int start,int end){
        if(start>end){
            return null;
        }
      int mid=start+(end-start)/2;
      Node root=new Node(arr.get(mid));
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

    public static Node BST(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=BST(root.left,val);
        }
        if(root.data<val){
            root.right=BST(root.right,val);
        }
        return root;
    }
    
     
    public static void main(String[] args) {
        int val[]={3,4,5,6,7,8,9,11,14,15};
        Node root=null;
        for (int i = 0; i < val.length; i++) {
            root=BST(root,val[i]);
        }
        preorder(root);
       ArrayList<Integer>sortedArr=new ArrayList<>();
       inOrder(root, sortedArr);
       root=create(sortedArr,0,sortedArr.size()-1);
       System.out.println();
        preorder(root);
       
    }
}