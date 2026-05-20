public class RotatedPivotBS{
    
    //smallest element in array
    public static int searchMinimum(int arr[]){
      int start=0;
      int end=arr.length-1;
      while(start<end){
        int mid=start+(end-start)/2;
        if(mid>0 && arr[mid]<arr[mid-1]){
            return mid;
        }
        else if(arr[start]<=arr[mid] && arr[mid]>arr[mid+1]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
      }
      return start;
    }

    //according to that search in array
    public static int checkTarget(int Array[],int target){
      int min=searchMinimum(Array);
    //   System.out.println("Minimum is "+Array[min]);
      if(Array[min]<=target && Array[Array.length-1]>=target ){
       return BinarySearch(min,Array.length-1,Array,target);
    
      }
      else{
       return BinarySearch(0,min-1,Array,target);
      }
    }


    //searching using binary search
     public static int BinarySearch(int start,int end,int Array[],int target){
        while(start<=end){
        int mid=start+(end-start)/2;
        if(Array[mid]==target){
            return mid;
        }
        else if(Array[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
       int ans= checkTarget(arr,target);
       System.out.println(ans);
    }
}
