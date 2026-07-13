
import java.util.Scanner;

public class PrefixProblem{
    static class Node{
      Node children[]=new Node[26];
      boolean eow=false;
      int freq;
      public Node(){
        for (int i = 0; i < 26; i++) {
            children[i]=null;
        }
        freq=1;
      }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
              curr.children[idx]=new Node();
            }
            else{
               curr.children[idx].freq++;
            }
           curr=curr.children[idx];
        }
        curr.eow=true;
    }
     
     public static void prefixProblem(Node root,String ans){
        if(root==null){
           return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if(root.children[i]!=null){
                prefixProblem(root.children[i], ans+(char)(i+'a'));
            }
        }
     }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("How many element do you want :- ");
        // int n=sc.nextInt();
        // String words[]=new String[n];
        // for (int i = 0; i < n; i++) {
        //     words[i]=sc.next();
        // }
       String words[]={"zebra","dog","dove","duck"};
     for (int i = 0; i < words.length; i++) {
         insert(words[i]);
     }
    root.freq=-1;
     prefixProblem(root,"");
    }
}