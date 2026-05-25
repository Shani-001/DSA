public class Fibnaci{
    public static int CalculateFibonaci(int num){
      if(num==0 || num==1){
        return num;
      }
      num=CalculateFibonaci(num-1)+CalculateFibonaci(num-2);
      return num;

    }
    public static void main(String args[]){
        int num=6;
        System.out.println(CalculateFibonaci(num));
    }
}