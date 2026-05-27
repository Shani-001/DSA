public class MergeSort{

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void MergeSort(int arr[],int start,int end){
        //base case
        if(start>=end){
            return;
        }
        //kaam
        //divide
        int mid=start+(end-start)/2;  //it is equal to mid=(start+end)/2  we used that because for larger array it can cross the integer size;
        MergeSort(arr, start, mid);  //giving left part
        MergeSort(arr, mid+1, end);  //giving right part
        merge(arr,start,mid,end);    
    }

    //sorting array
    public static void merge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start; //idx for 1st sorted part
        int j=mid+1; //idx for 2nd sorted part
        int k=0;     //idx for temp array
        
        //put sorting temp array
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //leftover elements for first sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //leftover element for second sorted part
        while(j<=end){
            temp[k++]=arr[j++];
        }
       //copy temp to original array
        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        MergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}