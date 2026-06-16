
import java.util.LinkedList;
import java.util.Queue;

public class NonrepeatStream{
    public static void main(String args[]){
      Queue<Character> q=new LinkedList<>();
      String str="aabccxb";
       
      int freq[]=new int[26];
      
      for (int i = 0; i < str.length(); i++) {
         char ch=str.charAt(i);
         q.add(ch);
        //  System.out.println(ch-'a');
         freq[ch-'a']++;
         while(!q.isEmpty() && freq[q.peek()-'a']>1){
            q.remove();
         }
         if(q.isEmpty()){ 
            System.out.println("-1 ");
         }
         else{
            System.out.println(q.peek()+" ");
         }

      }
    }
}