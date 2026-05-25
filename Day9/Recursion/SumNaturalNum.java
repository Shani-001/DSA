public class SumNaturalNum{
    public static int SumNatualNum(int num) {
        if(num==1){
            return 1;
        }
        int sum=num+SumNatualNum(num-1);
        return sum;
    }
    public static void main(String[] args) {
        int num=3;
        System.out.print(SumNatualNum(num));
    }
}