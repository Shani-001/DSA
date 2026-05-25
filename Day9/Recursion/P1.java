public class P1{

    public static void PrintNumDecreasing(int num){
        //Base Condition
      if(num==1){
        System.out.print(num);
        return;
      }
      //print
      System.out.print(num+" ");
      //Call to Function again for printing other values smaller than this till base condition
      PrintNumDecreasing(num-1);
    } 

    public static void PrintInc(int num){
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        PrintInc(num-1);
        System.out.print(num+" ");
    }
    public static void main(String args[]){
        int n=10;
    //    PrintNumDecreasing(n);
         PrintInc(n);
    }
}