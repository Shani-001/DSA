
import java.util.ArrayList;

public class PairSum1{

    public static String pairSum(ArrayList<Integer>list,int target){
        int Lp=0;
        int Rp=list.size()-1;
        while(Lp<Rp){
            if((list.get(Lp)+list.get(Rp))==target){
             return "("+list.get(Lp)+","+list.get(Rp)+")";
            }
           else if((list.get(Lp)+list.get(Rp))<target){
                Lp++;
            }
            else if((list.get(Lp)+list.get(Rp))>target){
             Rp--;
            }
        }
        return "Answer not found";
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=8;
        
       String ans= pairSum(list,target);
       System.out.println(ans);
    }
}