import java.util.*;
public class Input{
  public static void main (String args[]){
    //if i want to take input from user then i can take it using Scanner class
    Scanner sc=new Scanner(System.in);
    // String a=sc.next();
    // System.out.print(a);

    /*input in java
      next =>String input till space it take input
      nextLine =>line,para 
      nextInt =>input as number
      nextByte
      nextFloat
      nextBoolean
      nextLong
      nextDouble
      nextShort
    */
//    boolean a1=sc.nextBoolean();
//    System.out.print(a1);


   float bb=sc.nextFloat();
   float product=3.14f*bb*bb;  //always write f with floating values because compiler take it by default as double and when you store it in float then it gives error
   System.out.print(product); 
  }
}