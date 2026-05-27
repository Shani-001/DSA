public class SearchRotatedSortedArray{

    public static int SearchTarget(int arr[],int start,int end,int tar){
        
        //kaam
        int mid=start+(end-start)/2;
        //case Found
        if(arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if(arr[start]<=arr[mid]){
            //case a:left
            if(arr[start]<=tar && tar<=arr[mid]){
                return SearchTarget(arr, start, mid-1, tar);
            }
            //case b:right
            else{
                return SearchTarget(arr, mid+1, end, tar);
            }
        }
        //mid on L2
        else{
            //case c:right
            if(arr[mid]<=tar && tar<=arr[end]){
                return SearchTarget(arr, mid+1, end, tar);
            }
            //case d:left
            else{
                return SearchTarget(arr,start,mid,tar);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int index=SearchTarget(arr,0,arr.length,0);
        System.out.println(index);
    }
}