import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort{
    public static void main(String args[]){
        //Inbuilt sort function
        int arr[]={5,2,3,4,1};
        Arrays.sort(arr);

        //Sort in range
        // Arrays.sort(arr,0,3);

        //decreasing or reverse order
        Integer arr1[]={5,2,3,4,1};  //We need to pass object for this so we are using Integer
        Arrays.sort(arr,Collections.reverseOrder());
          
          //reverse in a range
        Arrays.sort(arr,0,3,Collections.reverseOrder());

        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}