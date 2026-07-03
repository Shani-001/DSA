
import java.util.*;

public class ImplementHashMap{
    static class HashMap<K,V>{ //generic=>If we Dont know the type of Values and keys then we use it
    public class Node{
      K key;
      V value;
      public Node(K key,V value){
         this.key=key;
         this.value=value;
      }
    }
      private int n;
      private int N;
      private LinkedList<Node> Bucket[];

        @SuppressWarnings("unchecked") //We need to write the Type of LinkedList Before Make it so in version of Java it give err so to not get that error we use this
        public HashMap() {
            this.N=4;
            this.Bucket=new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                Bucket[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
          int hc=key.hashCode();
          return Math.abs(hc)%N;
        }
        private int SearchInLl(K key,int bi){
           LinkedList<Node> ll=Bucket[bi];
           int di=0;
           for (int i = 0; i < ll.size(); i++) {
               if(ll.get(i).key==key){
                return di;
               }
               di++;
           } 
           return -1;
        }

        @SuppressWarnings("unchecked")
        public void rehash(){
         LinkedList<Node>oldBucket[]=Bucket;
         Bucket=new LinkedList[N*2];
         N*=2;
         for (int i = 0; i < Bucket.length; i++) {
             Bucket[i]=new LinkedList<>();
         }
        //  nodes=>add in new Bucket
         for (int i = 0; i < oldBucket.length; i++) {
             LinkedList<Node> ll=oldBucket[i];
            for (int j = 0; j < ll.size(); j++) {
                Node n1=ll.get(j);
                put(n1.key,n1.value);
            }
         }

        }

        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=SearchInLl(key,bi);
            if(di!=-1){
                Node ll=Bucket[bi].get(di);
                 ll.value=value;
            }else{
               Bucket[bi].add(new Node(key,value));
               n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
              rehash();
            }
        }

        public boolean containsKey(K key){
         int bi=hashFunction(key);
         int di=SearchInLl(key,bi);
         if(di!=-1){
            return true;
         }else{
            return false;
         }
        }

        public V remove(K key){
             int bi=hashFunction(key);
            int di=SearchInLl(key,bi);
            if(di!=-1){
                Node node=Bucket[bi].remove(di);
                n--;
               return node.value;
            }else{
               return null;
            }
        }

        public V get(K key){
             int bi=hashFunction(key);
            int di=SearchInLl(key,bi);
            if(di!=-1){
                Node node=Bucket[bi].get(di);
                 return node.value;
            }else{
               return null;
            }
        }

        public ArrayList<K> keySet(){
          ArrayList<K>keys=new ArrayList<>();
          for (int i = 0; i < Bucket.length; i++) {
              LinkedList<Node>ll=Bucket[i];
              for (Node node : ll) {
                  keys.add(node.key);
              }
          }   
          return keys;
        }

      public boolean isEmpty(){
        return n==0;
      }
     
    }
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",400);
        hm.put("Nepal",20);
        
        hm.put("Bangladesh",80);
        System.out.println(hm.remove("China"));
        ArrayList<String>arr=hm.keySet();
        for (String key : arr) {
            System.out.println(key+" "+hm.get(key));
        }
        System.out.println(hm.remove("China"));


    }
}