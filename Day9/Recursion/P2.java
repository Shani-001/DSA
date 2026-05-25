public class P2{
    public static int Factorial(int num){
        if(num==0){
            return 1;
        }
        num=num*Factorial(num-1);
       return num;

    }
    public static void main(String args[]){
        int n=5;
        int num=Factorial(n);
        System.out.println(num);

    }
}