
import java.util.HashSet;

public class CountDistinct{
    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set=new HashSet<>();
        for (Integer elem : arr) {
            set.add(elem);
        }
        System.out.println(set.size());
    }
}