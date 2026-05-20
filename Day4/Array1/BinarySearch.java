public class BinarySearch{

    public static int BinarySearch(int Number[],int key){
        
        int start=0;
        int end=Number.length;
        int mid=0;
        while(start<=end){
         mid=(start+end)/2;
            if(Number[mid]==key){
                return mid;
            }
            else if(Number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int Number[]={10,20,30,40,50,60,70,80,90,100};
        int key=100;
        int ans=BinarySearch(Number,key);
        System.out.println("Ans is "+ans);
    }
}