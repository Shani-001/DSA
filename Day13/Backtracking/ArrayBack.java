public class ArrayBack{
    public static void ChangeArr(int arr[],int i,int val){
        //base condition
        if(i==arr.length){
            print(arr);
            return;
        }
        //assign value
        arr[i]=val;
        ChangeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        ChangeArr(arr,0,1);
        print(arr);

    }
}