import java.util.ArrayList;
public class Basics{
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        // System.out.println(List);
        int item=List.get(2);
        // System.out.println(item);
        // List.remove(2);
        // System.out.println(List);
        // List.set(0,10);  //set the value at index
        // System.out.println(List);   
        boolean ans=List.contains(10);
        // System.out.println(ans);
        System.out.println(List.size());
        // for (int i = 0; i < List.size(); i++) {
        //     System.out.print(List.get(i)+" ");
        // }
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(List.size()-i-1));
        }

    }
}