public class Function1{

    public static boolean Prime(int num){
        boolean ans=true;
        if(num==1){
            ans=false;
        }
        else if(num==2){
            ans=true;
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }

    public static void PrimeRange(int num){
        for(int i=1;i<=num;i++){
            if(Prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
    //  System.out.println(Prime(15));
    int num=15;
    PrimeRange(num);
    }
}