
import java.util.Stack;

public class NextGreater{

   public static void nextGreater(int arr[],int nextG[]){
    Stack<Integer>s=new Stack<>();
    for (int i = arr.length-1; i >=0; i--) {
        int curr=arr[i];
        while(!s.isEmpty() && curr>=arr[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
         nextG[i]=-1;
        }
        else{
            int nextGreater=arr[s.peek()];
            nextG[i]=nextGreater;
        }
        s.push(i);
    }
   }

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nextG[]=new int[arr.length];
        nextGreater(arr,nextG);
        for (int i = 0; i < nextG.length; i++) {
            System.out.println(nextG[i]+" ");
        }
    }
}