
import java.util.Stack;

public class DuplicatePara{

    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count =0;
            if((ch=='(')||(ch>='a' &&ch<='z')||(ch=='+'||ch=='-'||ch=='/'||ch=='*'||ch=='%')){
                s.push(ch);
            }
            else{
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b)+c)";
        System.out.print(isDuplicate(str));
    }
}