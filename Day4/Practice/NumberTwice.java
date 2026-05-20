public class NumberTwice{

    public static void checkAnyNumberAppearTwice(int arr[]){
        int start=0;
        int end=arr.length-1;
        boolean isTwice=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    isTwice=true;
                    break;
                }
            }
        }
        System.out.println("Elements appeared twice is "+isTwice);
    }
    public static void main(String args[]){
        int arr[]={1,1,1,3,3,4,3,2,4,2};
        checkAnyNumberAppearTwice(arr);
    }
}