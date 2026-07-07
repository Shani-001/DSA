public class Insert{
    static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        Node(){
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    
    //INSERT THE ELEMENT
    public static void insert(String word){ //O(L)=>Largest word Length
       Node curr=root;
       for (int level = 0; level < word.length(); level++) {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
       }
       curr.eow=true;
    }
    //SEARCH THE ELEMENT
    public static boolean search(String word){ //O(L)=>Largest word Length
       Node curr=root;
       for (int level = 0; level < word.length(); level++) {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
               return false;
            }
            curr=curr.children[idx];
       }
       if(!curr.eow==true){
         return false;
       }
       return true;
    }
    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        boolean ans=search("theer");
        if(ans){
            System.out.println("EXIST WORD");
        }
        else{
            System.out.println("NOT EXIST WORD");
        }
    }
}