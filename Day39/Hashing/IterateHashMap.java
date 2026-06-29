import java.util.*;
class HashMap1{
    public static void main(String args[]){
        // Create
        HashMap<String,Integer> hm=new HashMap<>();
        //1.PUT
        hm.put("India",100);
        hm.put("Pak",10);
        hm.put("China",120);
         
        Set<String>keys=hm.keySet();
        for (String k : keys) {
            System.out.println("key="+k+",value="+hm.get(k));
        }

    }
}