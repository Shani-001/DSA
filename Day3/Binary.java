public class Binary{

    //Decimal to Binary Conversion

    public static int Binary(int num){
        int Bin=0;
        int i=0;
        while(num>0){
            
            Bin=Bin+(num%2)*(int)Math.pow(10,i);
            num=num/2;
            i++;
        }
        return Bin;
    }


    //Binary to Decimal Conversion
    // public static int Decimal(int num){
    //    int dec=0,i=0;
    //     while(num>0){
    //         int num1=num%10;
    //         // System.out.print(i+" "+num1+" ");
    //         dec=dec+num1*(int)Math.pow(2,i);
    //         // System.out.print(dec+" ");

    //         num=num/10;
    //         i++;
    //     }
    //     return dec;
    // }
    public static void main (String args[]){
    //    int num= Decimal(101);
    int num=Binary(5);
       System.out.println(num);
    }
}