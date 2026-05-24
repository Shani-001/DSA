public class OddOrEven{

    public static void UpdateBit(int n,int i,int newBit){
        // if(newBit==0){
        //     System.out.println(n&~(1<<i));
        // }
        // else{
        //     System.out.println(n|(1<<i));
        // }
        int clearIthBit=n&~(1<<i);
        int newBit1=newBit<<i;
        if(newBit==0){
            System.out.println(clearIthBit);
        }
        else{
            System.out.println(clearIthBit|newBit);
        }
    }
    public static void main(String[] args) {
        // int bitmask=1;
        // int a= 10 & bitmask;
        // if(a==1){
        //     System.out.println("odd");
        // }
        // else{
        //     System.out.println("even");
        // }

        //get ith bit
        // int i=3;
        // int bitmask=1<<i;
        // int ans=(15&bitmask)==0?0:1;
        // System.out.println(ans);

        //set ith Position  
        // int ans=3|(1<<2);
        // System.out.println(ans);

        //clear ith bit
        // int ans=10&~(1<<1);
        // System.out.println(ans);
        
        //update ith bit
        //var=0 or 1
        //value=0 clear
        //value=1 set

        // UpdateBit(15,3,0);

        // clear Last Ith bit
        // int bitmask=(-1)<<2;  //i=2
        // int ans=15&bitmask;
        // System.out.println(ans);

        //clear bits in range i to j
        int i=1,j=2;
        int a=(-1)<<j+1;
        int b=(1<<i)-1;
        int ans=15&(a|b);
        System.out.println(ans);

        
    }
}