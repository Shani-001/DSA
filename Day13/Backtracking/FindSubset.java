public class FindSubset{
    public static void PrintSubset(String str,String ans,int i){
        //base condition
        if(i==str.length()){
          if(ans.length()==0){
            System.out.println("null");
          }
          else{
            System.out.println(ans);
          }
          return;
        }
        //recursion
        //yes choice
        PrintSubset(str, ans+str.charAt(i), i+1);
        //no choice
        PrintSubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        PrintSubset("abc","",0);
    }
}