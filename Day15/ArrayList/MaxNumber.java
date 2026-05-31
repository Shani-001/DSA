import java.util.ArrayList;
public class MaxNumber{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        int Max=Integer.MIN_VALUE;
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(7);
        for(int i=0;i<list.size();i++){
        if(Max<list.get(i)){
            Max=list.get(i);
        }
        }
        System.out.println(Max);
    }
}