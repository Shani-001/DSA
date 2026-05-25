public class FirstOccurence{
    public static int SearchFirstKey(int arr[],int i,int key){
        if(arr[0]==key){
            return 0;
        }
        if(i==arr.length-1){
            return -1;
        }
       if(key==arr[i]){
        return i;
       }
      return SearchFirstKey(arr,i+1,5);
    }
    public static int SearchLastKey(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
       int isFound=SearchLastKey(arr, i+1, key);
       if(isFound==-1 && arr[i]==key){
        return i;
       }
       return isFound;
       
    }
    // public static int SearchLastKey(int arr[],int i,int key){
    //     if(arr[arr.length-1]==key){
    //         return arr.length-1;
    //     }
    //     if(i<=0){
    //         return -1;
    //     }
    //    if(key==arr[i]){
    //     return i;
    //    }
    //   return SearchLastKey(arr,i-1,5);
    // }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5,6,6,8,6,5,9,0};
        // int ans=SearchFirstKey(arr,0,5);
        int ans=SearchLastKey(arr,0, 5);
        System.out.println(ans);
    }
}