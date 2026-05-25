public class Power{

    //more optimized
    public static int CalculatePow(int x,int n){
        if(n==0){
            return 1;
        }
       int halfPower=CalculatePow(x,n/2);
       int halfSquare=halfPower*halfPower;
        if(n%2!=0){
          return x*halfSquare;
        }
        return halfSquare;
   
        
    }

    //less optimized
    // public static int CalculatePow(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return x*CalculatePow(x, n-1);
        
    // }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.print(CalculatePow(x,n));
    }
}