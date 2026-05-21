import java.util.*;
public class MergeSorted{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;
    //    System.out.print(m+" "+n);
        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }   
        for(int i=0;i<nums1.length;i++){
         System.out.print(nums1[i]+" ");
        } 

    }
    public static void main(String args[]){
     int arr1[]={1,2,3,0,0,0};
     int arr2[]={2,5,6};
     merge(arr1,3,arr2,3);
    }
}