public class ReverseArray{

    public static void Swap(int num1,int num2,int Array[]){
        int temp=0;
        temp=Array[num1];
        Array[num1]=Array[num2];
        Array[num2]=temp;
        
    }

    public static void Reverse(int Array[]){
        int start=0;
        int end=Array.length-1;
        while(start<end){   //<= we have written because start and end will same then we dont need to reverse
            Swap(start,end,Array); 
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int Array[]={10,20,30,40,50};
        Reverse(Array);
        for (int i = 0; i < Array.length; i++) {
        System.out.print(Array[i]+" ");
        }
            
    }
}