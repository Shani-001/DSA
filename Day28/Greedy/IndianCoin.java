
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class IndianCoin{
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int count=0;
        int amount=590;
        ArrayList<Integer>ans=new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    amount-=coins[i];
                    count++;
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("Ans is : "+count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}