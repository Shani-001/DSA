
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
// import java.util.Character;

public class Prac1{

    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void Reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
           int temp= arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
    }

    public static void Merge(int arr[],int arr2[]){
        int m=arr.length;
        int n=arr2.length;
        int arr3[]=new int[m+n];
        int i=0;
        int j=arr2.length-1;
        int k=0;
        while(i<arr.length && j>0){
          if(arr[i]<arr2[j]){
            arr3[k]=arr[i];
            i++;
          }
          else{
            arr3[k]=arr2[j];
            j--;
          }
          k++;
        }

        while(i<arr.length){
            arr3[k]=arr[i];
            k++;
            i++;
        }
        while(j>=0){
            arr3[k]=arr2[j];
            k++;
            j--;
        }
        System.out.println(Arrays.toString(arr3));
       
    }

    public static void subarray(int arr[]){
        int curr=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
           curr=Math.max(curr+arr[i],arr[i]);
           max=Math.max(curr,max);
        }
        System.out.print(max);
    }

    public static void trappedWater(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i]=Math.max(arr[i],left[i-1]);
        }
        System.out.println(Arrays.toString(left));
        right[arr.length-1]=arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            right[j]=Math.max(arr[j],right[j+1]);
        }
        System.out.println(Arrays.toString(right));
         
        int waterlevel=0;
        int max=0;
        int height;

        for (int i = 0; i <arr.length; i++) {
            height=arr[i];
            waterlevel+=(Math.min(right[i],left[i])-height)*1;
            if(max<waterlevel){
                max=waterlevel;
            }     
        }
        System.out.println(max);
    }

    public static void buyAndSell(int arr[]){
        int buyPrice=Integer.MAX_VALUE;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sellingPrice=arr[i];
            if(buyPrice<sellingPrice){
               int Profit=sellingPrice-buyPrice;
               max=Math.max(Profit,max);
            }
            else{
                buyPrice=sellingPrice;
            }

        }
        System.out.println(max);
    }


    

    public static int[] twoSum(int[] nums, int target) {  
     HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }

    public static void spiralPrint(int arr[][]){
        int sr=0;
        int er=arr.length-1;
        int sc=0;
        int ec=arr.length-1;
        while(sr<=er && sc<=ec){
            //top
            for (int i = sc; i <=ec; i++) {
                System.out.print(arr[sr][i]+" ");
            }
            //right
             for (int i = sr+1; i <=er; i++) {
                System.out.print(arr[i][ec]+" ");
            }
            //bottom
             for (int i = ec-1; i >=sc; i--) {
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][i]+" ");
            }
            //left
             for (int i = er-1; i >=sr+1; i--) {
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }

    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int arr[]={2,7,11,15};
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // int arr2[]={5,8,9};
        // int arr2[]={110,99,89};
        // int ans=BinarySearch(arr, 88);
        // Reverse(arr);
        // System.out.print(Arrays.toString(arr));
        // Merge(arr, arr2);
        // subarray(arr);
        // trappedWater(arr);
        // buyAndSell(arr);
        // mergeSortedarray(arr,arr2);
        // int arr2[]=twoSum(arr, 9);
        // System.out.println(Arrays.toString(arr2));
        spiralPrint(arr);
    }
}