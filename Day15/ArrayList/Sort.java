import java.util.ArrayList;
import java.util.Collections;
public class Sort{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(17);
        list.add(5);
        list.add(20);
        //We can This sorting in any where because this method is Optimized Method of Sort
        // Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());  //Collections.reverseOrder() it is a Comparator in java 
        System.out.print(list);
    }
}