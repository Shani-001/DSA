public class Permutation{
    public static void printPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            //"abcde"=>"ab"+"de"=>"abcde" remove c
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        printPermutation("abc","");
    }
}