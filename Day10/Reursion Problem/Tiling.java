public class Tiling {
    public static int TilingWay(int n){
        if(n==0 ||n==1){
            return 1;
        }
        //vertically placed tile
        int fnm1=TilingWay(n-1);
        int fnm2=TilingWay(n-2);
        int TotalWays=fnm1+fnm2;
        return TotalWays;
    }
    public static void main(String args[]){
        int n=4;
        System.out.print(TilingWay(n));
    }
}