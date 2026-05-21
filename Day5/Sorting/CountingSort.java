public class CountingSort{

    public static void CountingSort(int arr[]){
        int largest=Integer.MIN_VALUE;

        //Finding Largest Element using original array for finding new array size
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        
        //counting frequency using original array and inserting frequency in count array
        int count[]=new int[largest+1];  //array size start from zero
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        
        //Inserting element in original array using frequency array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }

    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        CountingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}