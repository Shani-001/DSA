import java.util.*;

public class SubArray{

    public static void printSubArray(int Array[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            int start=i;
            // System.out.println(Array[i]);
            for (int j = i; j < Array.length; j++) {
                int end=j;
                int sum=0;
                
                for (int k = start; k <=end; k++) {
                    System.out.print(Array[k]+" ");
                    sum+=Array[k];
                }
                if(min>sum){
                    min=sum;
                }
                if(max<sum){
                    max=sum;
                }
                System.out.print("\n Sum is: "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("min is "+min);
        System.out.println("max is "+max);
    }
    public static void main(String args[]){
        int Array[]={1,2,3,4,5};
        printSubArray(Array);
    }
}