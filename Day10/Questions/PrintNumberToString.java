public class PrintNumberToString{

    public static void PrintString(int n,String arr[]){
        if(n<=0){
            return;
        }
        int currnum=n%10;
        PrintString(n/10, arr);
        System.out.print(arr[currnum]+" ");
    }
    public static void main(String args[]){
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int n=1947;
        PrintString(n,arr);
    }
}