public class BinaryString{
    public static void BinaryString1(int n,int lastplace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //if lastplace=0 we can put 0;
        BinaryString1(n-1,0, str+"0");
        if(lastplace==0){
            BinaryString1(n-1,1, str+"1");
        }
        return;
    }

    public static void main(String[] args) {
        BinaryString1(3,0,"");
    }
}