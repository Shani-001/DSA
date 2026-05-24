public class Exponentia{
    public static void CalculateAns(int num,int pow){
        int ans=1;
        while(pow>0){
        if((pow&1)!=0){
          ans=ans*num;
        }
        else{
            ans=ans*1;
        }
        num=num*num;
        pow=pow>>1;
        
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int number=3;
        int pow=3;
        CalculateAns(number,pow);
    }
}