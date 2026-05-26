public class AllOccurence{

    public static void PrintAllOccurence(int arr[],int i,int key){
        if(i==arr.length){
           return;
        }
        if(arr[i]==key){
            System.out.println(i);
        }
        PrintAllOccurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
       PrintAllOccurence(arr,0,2);
    }
}