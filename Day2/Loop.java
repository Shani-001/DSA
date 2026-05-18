import java.util.*;
public class Loop{
    public static void main(String args[]){
        // for(int i=0;i<3;i++){
        //     System.out.println("Hello World");
        // }
    //   int i=1;
    //   Scanner sc=new Scanner(System.in);
    //   int num=sc.nextInt();
    //   int sum=0;
    //     while(i<=num){
    //         sum=sum+i;
    //         // System.out.println(i);
    //         i++;
    //     }
    //     System.out.println(sum);


    //output=>****
            //   ****
            //   ****
            //   ****
            // for(int i=1;i<=4;i++){
            //     for(int j=1;j<=4;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


    //Reverse of number 12345
    // int num=12345;
    // int reverse=0;
    //    for(int i=0;num>0;i++){
    //     reverse =num%10;
    //     System.out.print(reverse);
    //     num=num/10;

    //    }

    //Reverse the given number
    // int num=12233;
    // int rev=0;
    // while(num>0){
    //     int lastdigit=num%10;
    //     rev=(rev*10)+lastdigit;
    //     num=num/10;
    // }
    // System.out.print(rev);
      

//     Scanner sc=new Scanner(System.in);
//    int num=1;
//     while(num%10!=0){
//     num=sc.nextInt();
//     System.out.println(num);
//     }

//break is used to break the loop
//continue is used to skip the iteration 

// Scanner sc=new Scanner(System.in);
// while(true){
//     int num=sc.nextInt();
//     if(num%10==0){
//         continue;
//     }
//     System.out.println(num);
// }

//prime or not 
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
if(num==1){
    System.out.println("1 is not a prime and not a composite number");
}
else if(num==2){
    System.out.println("2 is a prime number");
}
else{
boolean isPrime=true;
for(int i=2;i<Math.sqrt(num);i++){
    if(num%i==0){
        isPrime=false;
        break;
    }
}
if(isPrime && num!=1){
    System.out.println("Prime");
}
else{
    System.out.println("Not Prime");
}
}

    }
}