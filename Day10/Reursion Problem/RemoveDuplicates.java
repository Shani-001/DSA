public class RemoveDuplicates{

    public static void RemoveDup(String name,int i,StringBuilder newString,boolean[] Map){
        if(i==name.length()){
           System.out.print(newString);
           return;
        }
        int index=name.charAt(i)-'a';
        if(Map[index]==true){
          RemoveDup(name, i+1, newString, Map);
        }
        else{
            Map[index]=true;
            RemoveDup(name, i+1, newString.append(name.charAt(i)), Map);
        }
    //   return;
    }
    public static void main(String[] args) {
        String name="shhi";
        StringBuilder newString=new StringBuilder("");
        boolean Map[]=new boolean[26];
        RemoveDup(name,0, newString, Map);
        // System.out.print(RemoveDup(name,0,newString,Map));
    }
}