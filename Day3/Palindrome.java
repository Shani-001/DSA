public class Palindrome{

    // public static boolean isPalindrome(int num){
    //     int rev=0;
    //     int num1=num;
    //     while(num>0){
    //         int rem=num%10;
    //         rev=rev*10+rem;
    //         num=num/10;
    //     }
    //     return rev==num1?true:false;
    // }

    public static void IntegerSum(int num){
        int sum=0;
        while(num>0){
           sum=sum+num%10;
           num/=10;

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // int num=1211;
        // if(isPalindrome(num)){
        //     System.out.println("Number is a Palindrome");
        // }
        // else{
        //     System.out.println("Number is not a Palindrome");

        // }
       IntegerSum(55);

    }
}