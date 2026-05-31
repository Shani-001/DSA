import java.util.ArrayList;
public class Swap2Numbers{

    public static void Swap(ArrayList<Integer> list,int idx1,int idx2){
      int temp=list.get(idx1);
      list.set(idx1,list.get(idx2));
      list.set(idx2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        Swap(list,1,2);
        System.out.print(list);
    }
}