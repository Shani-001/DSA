public class Conditional{
    public static void main(String args[]){
        //parenthesis =>()
        //Curly Braces =>{}
        //if-else statement
        //else-if statement=> if statement is true then it will not check for else if statement so it saves time
        //if and then if statement in this it check both the condition even though 1st condition is true 

        // int a=0; //java take initial value as 0 bydefault when it is declared outside the main class
        // System.out.print(a);

        //Ternary Operator =>we have 3 Operand into this
        //Variable=Condition ? Statement1 : Statement2;
        //If condition is true then Statement1 will get store into Variable otherwise Statement2 will store into it.

        //Switch statement

        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // if(a<0){
        //     System.out.println("Number is Negative");
        // } else{
        //     System.out.println("Number is positive");
        // }


    //     double temp=103.5;
    //    if(temp>100){
    //     System.out.println("You have fever");
    //    }
    //    else{
    //     System.out.println("You dont have fever");
    //    }

    //  int a=63,b=36;
    //  int y=(a>b)?a:b;
    //  System.out.println(y);

    int a=2020;
    if(a%400==0){
          System.out.println("leap year");  
    }
   else if(a%100==0){
        System.out.println("Not a Leap year");
            }
    else if(a%4==0){
         System.out.println(" Leap year");
    }
    else{
        System.out.println("Not a leap year");
    }

    }

}