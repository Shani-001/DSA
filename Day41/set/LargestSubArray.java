
import java.util.HashMap;

public class LargestSubArray{
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        // int arr[]={3,4,5};
        HashMap<Integer,Integer>map=new HashMap<>();
        int len=0;
        map.put(arr[0],0);
        int sum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            //    for (int k = map.get(sum)+1; k <= i; k++) {
            //        System.out.print(arr[k]+" ");
            //    }
            //    System.out.println("");
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(len);
    }
}