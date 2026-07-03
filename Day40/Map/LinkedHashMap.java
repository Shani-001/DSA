import java.util.*;
class LinkedHashMap1{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("Bangladesh",80);
          lhm.put("India",100);
        lhm.put("China",400);
        lhm.put("Nepal",20);
        // System.out.println(lhm);
        // System.out.println(lhm.remove("China"));
        Set<String>arr=lhm.keySet();
        for (String key : arr) {
            System.out.println(key+" "+lhm.get(key));
        }
    }
}