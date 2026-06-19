public class Diameter2{
    static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

   static class Info{
        int diam;
        int ht;
       Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter2(Node root){

        if(root==null){
            return new Info(0,0);
        }
         
      Info leftInfo=diameter2(root.left);
      Info rightInfo=diameter2(root.right);
      int diameter=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
      int height=Math.max(leftInfo.ht,rightInfo.ht)+1;
      return new Info(diameter,height);
    }
    public static void main(String[] args) {
         Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
    //    root.right.right.left=new Node(8);

      Info ans= diameter2(root);
      System.out.println("ans is: "+ans.diam);
    }
}