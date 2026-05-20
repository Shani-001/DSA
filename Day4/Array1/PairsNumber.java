public class PairsNumber{

    public static void getPairs(int Array[]){
        for (int i = 0; i < Array.length; i++) {
            for (int j = i+1; j < Array.length; j++) {
                System.out.print("("+Array[i]+" "+Array[j]+") ");
            }
            
        }
    }
    public static void main(String args[]){
        int Array[]={2,3,4,5,6};
        getPairs(Array);
    }
}