
import java.util.ArrayList;

public class PairSum2{

    public static int[] pairSum2(ArrayList<Integer>list,int target){
        int pivot=0;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)>list.get(i+1)){
               pivot=i;
            }
        }
        int Lp=pivot+1;
        int Rp=pivot;
        int n=list.size();

        while(Lp!=Rp){
            if((list.get(Lp)+list.get(Rp))==target){
                return new int[]{list.get(Lp),list.get(Rp)};
            }
            if((list.get(Lp)+list.get(Rp))<target){
                Lp=(Lp+1)%n;
            }
            else{
                Rp=(n+Rp-1)%n;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target=16;
       int arr[]= pairSum2(list,target);
       System.out.println(arr[0]+" "+arr[1]);
    }
}