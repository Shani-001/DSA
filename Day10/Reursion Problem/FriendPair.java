public class FriendPair{

    public static int FriendPairWay(int n){
        //base case
        if(n==1 ||n==2){
            return n;
        }
        // choices
        //single
        int fnm1=FriendPairWay(n-1);
        //pairs
        int fnm2=FriendPairWay(n-2);
        int TotalWays=fnm1+(n-1)*fnm2;
        return TotalWays;
    }
    public static void main(String[] args) {
        int friends=3;
        System.out.print(FriendPairWay(friends));
    }
}