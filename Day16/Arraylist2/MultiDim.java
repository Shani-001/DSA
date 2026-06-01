
import java.util.ArrayList;

public class MultiDim{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);list2.add(4);list2.add(6);list2.add(8);list2.add(10);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(3);list3.add(6);list3.add(9);list3.add(12);list3.add(15);
        MainList.add(list);
        MainList.add(list2);
        MainList.add(list3);


        for (int i = 0; i < MainList.size(); i++) {
            ArrayList<Integer>currentList=MainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println("");
        }
    }
}