
import java.util.ArrayList;

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

    public static void printPath(ArrayList<Integer>path){
        System.out.println("");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.print("null");
    }

    public static void pathLeaf(Node root,ArrayList<Integer>path) {
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        pathLeaf(root.left,path);
        pathLeaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int val[]={8,5,3,6,10,11,14};
        Node root=null;
        for (int i = 0; i < val.length; i++) {
           root= insert(root, val[i]);
        }
        inOrder(root);
        pathLeaf(root, new ArrayList<>());
    }
}