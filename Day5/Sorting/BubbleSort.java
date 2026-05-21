public class BubbleSort{

    public static void BubbleSort(int arr[]){
        int n=arr.length;
             int swap=0;
        for (int i = 0; i <=n-2 ; i++) {
              if(i==1){
                if(swap==0){    //if array alredy sorted then checking after one loop to break loop if already sorted then
                    break;
                }
              }
            for (int j = 0; j <=n-2-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        swap++;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}