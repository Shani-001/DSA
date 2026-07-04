
import java.util.HashSet;

public class UnionIntersection{
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set=new HashSet<>();

        //Union
        for (Integer elem : arr1) {
            set.add(elem);
        }
        for (Integer elem : arr2) {
            set.add(elem);
        }
        System.out.println(set.size());
        for (Integer elem : set) {
            System.out.print(elem+" ");
        }
        System.out.println("");

        //Intersection
        set.clear();
        for (Integer elem : arr1) {
            set.add(elem);
        }
        int count=0;
        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println("");
        System.out.println(count);
    }
}