public class QuickSort{

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }

    public static void QuickSort(int arr[],int start,int end){
       //base case
       if(start>=end){
        return;
       }
       int pidx=partition(arr,start,end); //pivot element
       QuickSort(arr,start,pidx-1); //left
       QuickSort(arr,pidx+1,end); //right
    }
    public static int partition(int arr[],int start,int end){
        int i=start-1;
        int pivot=arr[end]; //to make space element smaller than pivot
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,4,6,2,5};
        QuickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}