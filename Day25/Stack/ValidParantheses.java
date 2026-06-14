
import java.util.Stack;

public class ValidParantheses{

    public static boolean isValid(String str){
      Stack<Character>s=new Stack<>();
      for (int i = 0; i < str.length(); i++) {
          char ch=str.charAt(i);
          //opening
          if(ch=='{'||ch=='('||ch=='['){
            s.push(ch);
          }
          else{
            //only closing parantheses string "))}}]"
            if(s.isEmpty()){
                return false;
            }
            else{//closing pair 
                if((s.peek()=='(' &&ch==')' ) ||(s.peek()=='{' &&ch=='}') ||(s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
          }

      }
      //is anything left then return false as string is completed
      if(s.isEmpty()){
        return true;
      }
      else{
        return false;
      }
    }
    public static void main(String args[]){
     String str="]";
     System.out.println(isValid(str));
    }
}