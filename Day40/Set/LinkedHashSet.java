
import java.util.LinkedHashSet;

 class LinkedHashSetCreate{
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);
        System.out.println(set);
        //all other operation can be performed by it as HashSet do
    }
}