import java.util.*;
public class Problems{
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter How many number ");
        // int numbers=sc.nextInt();
        // int EnteredNumber=0,SumEven=0,SumOdd=0;
        // for(int i=1;i<=numbers;i++){
        //     System.out.println("Enter Number");
        //     EnteredNumber=sc.nextInt();
        //     if(EnteredNumber%2==0){
        //         SumEven+=EnteredNumber;
        //     }
        //     else{
        //         SumOdd+=EnteredNumber;
        //     }

        // }
        // System.out.println("Sum of Odd Numbers:"+SumOdd);
        // System.out.println("Sum of Even Numbers:"+SumEven);
        

        //factorial of a number

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number to find Factorial");
        // int number=sc.nextInt();
        // int Fact=1;
        // if(number==0){
        //         System.out.println(1);
        //     }
        //     else if(number<0){
        //         System.out.println("Negative number dont have factorial");
        //     }
        //     else{
        // for(int i=number;i>0;i--){
        //     Fact=Fact*i;
        // }
        // System.out.println(Fact);
        //     }

        //Table of number
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+"X"+i+"="+(number*i));
        }
    }
}