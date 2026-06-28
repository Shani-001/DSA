public class Sort{

    public static void heapify(int arr[],int i,int size){
       int left=2*i+1;
       int right=2*i+2;
       int midIndx=i;

       if(left<size && arr[midIndx]>arr[left]){
        midIndx=left;
       }
       if(right<size && arr[midIndx]>arr[right]){
        midIndx=right;
       }
       if(midIndx!=i){
        int temp=arr[midIndx];
        arr[midIndx]=arr[i];
        arr[i]=temp;

        heapify(arr, midIndx, size);
       }
    }
    public static void heapSort(int arr[]){
        //step1 =>call heapidy for non leaf nodes
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
          heapify(arr,i,n-1);
        }

        //step2=>push largest into last
        for (int j = n-1; j >=0; j--) {
            //swap first with last
            int temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            //call heapify 
            heapify(arr,0,j);

        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,3,1};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
        
    }
}