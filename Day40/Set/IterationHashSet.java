
import java.util.*;

public class IterationHashSet{
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Jaipur");
        cities.add("Kanpur");
        cities.add("Delhi");
        cities.add("Mumbai");

        //1.Iterator on HashSet
        // Iterator it=set.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        //2.Enhanced For loop
        for (String city : cities) {
            System.out.print(city+" ");
        }
    }
}