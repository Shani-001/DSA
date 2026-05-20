import java.util.*;

public class SubArray{

    //Brute Force Approach Which has TC=>O(n^3)
    // public static void printSubArray(int Array[]){
    //     int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     for (int i = 0; i < Array.length; i++) {
    //         int start=i;
    //         // System.out.println(Array[i]);
    //         for (int j = i; j < Array.length; j++) {
    //             int end=j;
    //             int sum=0;
                
    //             for (int k = start; k <=end; k++) {
    //                 // System.out.print(Array[k]+" ");
    //                 sum+=Array[k];
    //             }
    //             if(min>sum){
    //                 min=sum;
    //             }
    //             if(max<sum){
    //                 max=sum;
    //             }
    //             System.out.print("Sum is: "+sum);
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("min is "+min);
    //     System.out.println("max is "+max);
    // }

    //Prefix Sum Approach
    // public static void printSubArray(int Array[]){
    //     int max=Integer.MIN_VALUE;
    //     int PrefixArray[]=new int[Array.length-1];

    //     PrefixArray[0]=Array[0];
            
    //     for (int i = 1; i < PrefixArray.length; i++) {
    //         PrefixArray[i]=PrefixArray[i-1]+Array[i];
    //     }

    //     for (int i = 0; i < PrefixArray.length; i++) {
    //         int start=i;
    //         // System.out.println(Array[i]);
    //         for (int j = i; j < PrefixArray.length; j++) {
    //             int end=j;
    //             int sum=0;
    //             sum=start==0?PrefixArray[end]:PrefixArray[end]-PrefixArray[start-1];
    //             if(max<sum){
    //                 max=sum;
    //             }
    //         }
    //     }
    //     System.out.println("max is "+max);
    // }

    //Kadane's Algorithm Approach
    public static void printSubArray(int Array[]){
        int max=Integer.MIN_VALUE;
        int currentSum=0;
        int AllNum=0;
        //check if all numbers are negative in array
        int numMax=Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if(Array[i]<0){
              AllNum++;
              numMax=Math.max(numMax, Array[i]);  //smallest number in array
            }
        }
       if(AllNum==Array.length){
        System.out.println("Max is "+numMax);
       }
       else{
        for (int i = 0; i <Array.length; i++) {
            
           currentSum+=Array[i];
           if(currentSum<0){
             currentSum=0;
            }
            if(max<currentSum){
                max=currentSum;
            }
        }
        System.out.println("max is "+max);
       }
    }
    public static void main(String args[]){
        int Array[]={-3,-5,-2,-1};
        printSubArray(Array);
    }
}